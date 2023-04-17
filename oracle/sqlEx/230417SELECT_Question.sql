--1) 각 학과별 학년별 학생 수를 ROLLUP함수로 검색하세요
SELECT MAJOR, SYEAR, COUNT(*)
FROM STUDENT
GROUP BY ROLLUP (MAJOR, SYEAR)
ORDER BY MAJOR, SYEAR;


--2) 화학과와 생물학과 학생 4.5 환산 평점의 평균을 각각 검색하는 데 화학과 생물이 열로 만들어지도록 하세요.(PIVOT 사용)
SELECT *
FROM (SELECT MAJOR, AVR
      FROM STUDENT)
    PIVOT (AVG(AVR * 1.125) FOR MAJOR IN ('화학' AS 화학, '생물' AS 생물));

--3) 학과별 학생이름을 ,로 구분하여 성적순으로(내림차순) 조회하세요.(LISTAGG 사용)
SELECT MAJOR, LISTAGG(SNAME, ', ') WITHIN GROUP ( ORDER BY SNAME DESC)
FROM STUDENT
GROUP BY MAJOR


--4) 부서별 업무별 연봉의 평균을 검색하세요(부서와 업무 컬럼의 그룹화 여부도 같이 검색, GROUPING 사용)
SELECT DNAME, JOB, ROUND(AVG(SAL)), GROUPING(DNAME), GROUPING(JOB)
FROM DEPT
         NATURAL JOIN EMP
GROUP BY ROLLUP (DNAME, JOB)
ORDER BY DNAME, JOB;


--1) 각 과목의 과목번호, 과목명, 담당 교수의 교수번호, 교수명을 검색하라(NATURAL JOIN 사용)
SELECT CNO, CNAME, PNO, PNAME
FROM COURSE
         NATURAL JOIN PROFESSOR;

--2) 화학과 학생의 기말고사 성적을 모두 검색하라(JOIN USING 사용)
SELECT SNO, SNAME, MAJOR, RESULT
FROM STUDENT
         JOIN C##STUDY.SCORE
              USING (SNO)
WHERE MAJOR = '화학';
--3) 화학 관련 과목을 강의하는 교수의 명단을 검색한다(NATURAL JOIN 사용)
SELECT *
FROM PROFESSOR
         NATURAL JOIN COURSE C2
WHERE C2.CNAME LIKE '%화학%';

--4) 화학과 1학년 학생의 기말고사 성적을 검색한다(NATURAL JOIN 사용)
SELECT SNO, SNAME, MAJOR, SYEAR, RESULT
FROM STUDENT
         NATURAL JOIN SCORE
WHERE MAJOR = '화학'
  AND SYEAR = 1
ORDER BY SNO;

--5) 일반화학 과목의 기말고사 점수를 검색한다(JOIN USING 사용)
SELECT CNAME, RESULT
FROM COURSE
         JOIN C##STUDY.SCORE USING (CNO)
WHERE CNAME = '일반화학';

--6) 화학과 1학년 학생이 수강하는 과목을 검색한다(NATURAL JOIN 사용)
SELECT MAJOR, SYEAR, CNAME
FROM STUDENT
         NATURAL JOIN COURSE
WHERE MAJOR = '화학'
  AND SYEAR = 1
GROUP BY CNAME, SYEAR, MAJOR


--1) 다중 컬럼 IN절을 이용해서 기말고사 성적이 80점 이상인 과목번호, 학생번호, 기말고사 성적을 모두 조회하세요.
SELECT RESULT, CNO, SNO
FROM SCORE
WHERE (CNO, SNO) IN (SELECT CNO, SNO
                     FROM SCORE
                     WHERE RESULT >= 80
                     )

--2) 다중 컬럼 IN절을 이용해서 화학과나 물리학과면서 학년이 1, 2, 3학년인 학생의 정보를 모두 조회하세요.
SELECT MAJOR, SYEAR, SNO, SNAME
FROM STUDENT
WHERE (MAJOR, SYEAR) IN (SELECT MAJOR, SYEAR
                         FROM STUDENT
                         WHERE MAJOR IN ('화학', '물리')
                           AND SYEAR IN (1, 2, 3))

--3) 다중 컬럼 IN절을 사용해서 부서가 10, 20, 30이면서 보너스가 1000이상인 사원의 사원번호, 사원이름, 부서번호, 부서이름, 업무, 급여, 보너스를
--   조회하세요.(서브쿼리 사용)
SELECT DNAME, COMM, ENO, ENAME, DNO, JOB, SAL
FROM EMP
         NATURAL JOIN DEPT
WHERE (DNO, COMM) IN (SELECT DNO, COMM
                      FROM EMP
                               NATURAL JOIN DEPT
                      WHERE DNO IN (10, 20, 30)
                        AND COMM >= 1000)


--4) 다중 컬럼 IN절을 사용하여 기말고사 성적의 최고점이 100점인 과목의 과목번호, 과목이름, 학생번호, 학생이름, 기말고사 성적을 조회하세요.(서브쿼리 사용)
SELECT CNO, CNAME, SNO, SNAME, RESULT
FROM COURSE
         NATURAL JOIN C##STUDY.SCORE
         NATURAL JOIN STUDENT
WHERE (SNO, CNO) IN (SELECT SNO, CNO
                     FROM COURSE
                              NATURAL JOIN C##STUDY.SCORE
                              NATURAL JOIN STUDENT
                     WHERE RESULT = 100)

--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여
--   일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호, 교수이름)
WITH JUNG AS (SELECT * FROM PROFESSOR WHERE ORDERS = '정교수'),
     NOR AS (SELECT * FROM COURSE WHERE CNAME LIKE '%일반%')
SELECT NOR.CNO, NOR.CNAME, JUNG.PNO, JUNG.PNAME
FROM JUNG, NOR
WHERE JUNG.PNO = NOR.PNO

--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와 보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--   두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH SAL AS(SELECT * FROM EMP WHERE SAL >= 3000),
     COM AS(SELECT * FROM EMP WHERE COMM >= 500)
SELECT SAL.ENO, SAL.ENAME, SAL.SAL, SAL.COMM
FROM SAL, COM
WHERE SAL.ENO = COM.ENO;

--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와 학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--   평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH STU AS(SELECT * FROM STUDENT WHERE AVR>=3.3),
     SCO AS(SELECT SNO, AVG(RESULT) AS AA FROM C##STUDY.SCORE GROUP BY SNO)
SELECT STU.SNO, STU.SNAME, STU.AVR, SCO.AA
FROM STU, SCO
WHERE STU.SNO = SCO.SNO

--4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을
--   갖는 가상테이블 하나를 생성하여 기말고사 성적이 90이상인 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 교수이름, 기말고사성적을 조회하세요.
WITH PROF AS(SELECT * FROM PROFESSOR WHERE MONTHS_BETWEEN(SYSDATE, HIREDATE)>=300),
     SIBA AS(SELECT * FROM COURSE NATURAL JOIN STUDENT NATURAL JOIN PROFESSOR NATURAL JOIN C##STUDY.SCORE)
SELECT DISTINCT SIBA.CNO, SIBA.CNAME, SIBA.SNO, SIBA.SNAME, SIBA.PNO, SIBA.PNAME, SIBA.RESULT
FROM PROF, SIBA
WHERE SIBA.RESULT>=90 AND PROF.PNO = SIBA.PNO;
--GROUP BY SIBA.CNO, SIBA.CNAME, SIBA.SNO, SIBA.SNAME, SIBA.PNO, SIBA.PNAME, SIBA.RESULT