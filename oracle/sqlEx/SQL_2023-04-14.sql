-- 1-6 변환 함수
-- 숫자를 문자로 변환 TO_CHAR
SELECT TO_CHAR(100000000, '999,999,999')
FROM DUAL; -- 9자리 숫자에 3자리 마다 , 출력

SELECT TO_CHAR(1000000, '099,999,999')
FROM DUAL; -- 9자리 숫자에 3자리 마다 , 출력 + 부족한 자릿수는 0

SELECT TO_CHAR(1000000, '999,999,999,999,999')
FROM DUAL;

-- 문자를 숫자로 변환
SELECT TO_NUMBER('-123.456', '999.999') -- 지정한 문자열보다 형식지정자를 자릿수를 같거나 더 많게 지정해야한다.
FROM DUAL;

SELECT TO_NUMBER('123', '999.99')
FROM DUAL;

SELECT TO_NUMBER('1234') -- 형식 지정자를 지정하지 않고 사용가능
FROM DUAL;

-- 날짜를 문자로 변환하는 TO_CHAR
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD'),
       TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'),
       TO_CHAR(SYSDATE, 'YYYY/MM/DD AM HH:MI:SS'),
       TO_CHAR(SYSDATE, 'YYYY/MM/DD DAY'),
       TO_CHAR(SYSDATE, '"오늘은 "YYYY"년 "MM"월 "DD"일 " DAY"입니다."'),-- 형식 지정자 안에서 문자열을 추가하려면 "" 사용
       TO_CHAR(SYSDATE, 'YYYY"년 " MONTH DD"일" ')
       --TO_CHAR(TO_DATE('99','YY'),'YY"년"'),
       --TO_CHAR(TO_DATE('99','YY'),'YY"년"')
FROM DUAL;

-- 문자를 날짜로 변환하는 TO_DATE
-- 날짜 출력형식이 NSL_DATE_FORMAT 기준으로 출력
SELECT TO_DATE('20211201 13:51:23', 'YYYY/MM/DD HH24:MI:SS'),
       TO_DATE('202304141059', 'YYYYMMDD HH24MISS'),
       TO_DATE('20230411', 'YYYY-MM-DD')
FROM DUAL;

-- TO_DATE 함수로 입사일이 19920201보다 빠른 사원목록 조회
SELECT *
FROM EMP
WHERE TO_DATE('19920201', 'YYYYMMDD') > HDATE;

-- 송강교수의 임용일자를 XXXX년 XX월 XX일 XX요일입니다. (TO_CHAR)
SELECT TO_CHAR(HIREDATE, 'YYYY"년 "MM"월 "DD"일 "DAY" 입니다."')
FROM PROFESSOR
WHERE PNAME = '송강';

-- 1-7 NULL값을 처리해주는 NVL
SELECT ENO, ENAME, NVL(COMM, -1) AS COMM
FROM EMP;

SELECT CNO, CNAME, NVL(PNO, 0)
FROM COURSE;

-- 위 쿼리에서 PROFESSOR와 OUTER JOIN으로 PNAME이 NULL인 값들을 '교수 배정안됨' 이라고 조회

SELECT C.CNO, C.CNAME, NVL(C.PNO, 0), NVL(P.PNAME, '교수 배정안됨')
FROM COURSE C
         LEFT JOIN PROFESSOR P on C.PNO = P.PNO;

-- 1-8 조건 처리 DECODE -> NULL가능
SELECT ENO,
       ENAME,
       JOB,
       SAL,
       DECODE(JOB,
              '개발', SAL * 1.5,
              '경영', SAL * 1.3,
              '지원', SAL * 1.1,
              '분석', SAL, SAL * 0.95)
           AS CHANGE_SAL
FROM EMP;

-- 1-9 CASE~WHEN -> NULL불가능
SELECT ENO,
       ENAME,
       JOB,
       SAL,
       CASE JOB
           WHEN '개발' THEN SAL * 1.5
           WHEN '경영' THEN SAL * 1.3
           WHEN '지원' THEN SAL * 1.1
           WHEN '분석' THEN SAL
           ELSE SAL * 0.95 END
           AS CHANGE_SAL
FROM EMP;

-- COMM이 NULL인 사람은 해당사항 없음, COMM이 0인 사람은 '보너스 없음', 나머지 사람들은 '보너스 : ' COMM
SELECT ENO
     , ENAME
     , COMM
     , CASE
           WHEN COMM > 0 THEN '보너스 : ' || COMM
           WHEN COMM IS NULL THEN '해당사항 없음'
           ELSE '보너스 없음'
    END AS COMM_TXT
FROM EMP;

-- 1. 그룹함수
-- 1-1 MAX
SELECT MAX(AVR)
FROM STUDENT;

-- 전공별 최대 평점
SELECT MAX(AVR), MAJOR
FROM STUDENT
GROUP BY MAJOR

-- 전공별로 학년별로 최대 평점
SELECT MAXAVR.AVR, S.MAJOR, S.SYEAR
FROM (SELECT MAX(AVR) AS AVR, MAJOR, SYEAR
      FROM STUDENT
      GROUP BY MAJOR, SYEAR
      HAVING MAJOR = '화학'
         AND MAX(AVR) > 2.6) MAXAVR
         LEFT JOIN STUDENT S
                   ON S.AVR = MAXAVR.AVR AND S.MAJOR = MAXAVR.MAJOR AND S.SYEAR = MAXAVR.SYEAR;


-- 기말고사 성적 중 과목별 가장 높은 점수 조회
SELECT AA.CNAME, AA.MR, S.SNO, S.SNAME
FROM (SELECT C.CNAME, SC.MR, SNO
      FROM COURSE C
               JOIN
           (SELECT MAX(RESULT) AS MR, CNO, SNO
            FROM SCORE
            GROUP BY CNO, SNO) SC
           ON C.CNO = SC.CNO) AA
         JOIN STUDENT S
              ON S.SNO = AA.SNO;


-- GROUP BY 통계함수 함께 사용
-- SELECT절에 통계함수
-- GROUP BY 절에 통계함수를 어떤 기준으로 통계를 낼 것인지, 특정컬럼을 지정하면 그 컬럼의 값이 같은 데이터들 끼리 모아서 통계를 내줌
-- 예로 SCORE 테이블에 CNO를 GROUP BY 절에 작성하면 각 CNO중에서 데이터를 통계를 낸다.

-- 1-2 MIN 기말고사 성적 전체 과목중 최저 값 조회
-- 테이블 전체 데이터의 통계를 낼 때는 GROUP BY를 사용할 필요가 없다.
SELECT MIN(RESULT)
FROM SCORE;

-- 부서별 연봉 최저가
SELECT MINSAL.DNO, D.DNAME, MINSAL.MS
FROM DEPT D
         JOIN (SELECT DNO, MIN(SAL) AS MS
               FROM EMP
               GROUP BY DNO) MINSAL
              ON MINSAL.DNO = D.DNO;

-- 부서별 연봉 최저값 부서명, 사원이름 포함(잘못된 GROUP BY)
-- 공통된 값이 없는 컬럼은 GROUP BY하면 그룹화의 의미가 없어진다.

SELECT MINSAL.DNO, D.DNAME, MINSAL.MS, E.ENAME
FROM DEPT D
         JOIN (SELECT DNO, MIN(SAL) AS MS
               FROM EMP
               GROUP BY DNO) MINSAL
              ON MINSAL.DNO = D.DNO
         JOIN EMP E ON E.SAL = MINSAL.MS;

-- 1-3 SUM
-- 각 부서별 보너스의 합계

-- COMM에 NULL값이 존재하기 때문에 NVL로 NULL값을 처리한 후 SUM을 실행
SELECT DNO, SUM(NVL(COMM, 0))
FROM EMP
GROUP BY DNO;

-- 1-4 COUNT
-- 각 학과별 학년별 학생수
SELECT MAJOR, SYEAR, COUNT(*)
FROM STUDENT
GROUP BY MAJOR, SYEAR

-- 학과별 교수의 수
SELECT SECTION, COUNT(*)
FROM PROFESSOR
GROUP BY SECTION

-- 1-5 AVG 평점의 평균
SELECT MAJOR, AVG(AVR)
FROM STUDENT
GROUP BY MAJOR;

-- 학과별 평점의 최대값
SELECT MAX(AVG(AVR))
FROM STUDENT
GROUP BY MAJOR;

-- 1-6 HAVING GROUP BY절에 명시된 컬럼들에 대한 조건 작성
-- DNO이 10,20,30인 부서의 평균 급여
SELECT DNO, AVG(SAL)
FROM EMP
GROUP BY DNO
HAVING DNO IN (10, 20, 30);

-- GROUP BY에 명시됐거나 통계함수가 아닌 컬럼은 HAVING절에 사용 불가
SELECT DNO, AVG(SAL)
FROM EMP
GROUP BY DNO
HAVING COMM > 600;

-- AND/OR 여러개의 조건을 붙을 수 있다.
SELECT DNO, AVG(SAL)
FROM EMP
GROUP BY DNO
HAVING DNO IN (10, 20, 30)
   AND AVG(SAL) <= 3000;

-- 부서중 평균 급여가 가장 높은 부서의 번호와 평균급여(ENP)
SELECT DNO, AVG(SAL)
FROM EMP
GROUP BY DNO
HAVING AVG(SAL) = (SELECT MAX(AVG(SAL))
                   FROM EMP
                   GROUP BY DNO)
-- 그룹함수에 대한 조건은 WHERE에서 사용불가 -> 서브쿼리로 만들어서 비교

-- 임용연도가 동일한 교수의 수를 조회
SELECT TO_CHAR(HIREDATE, 'YYYY'), COUNT(*)
FROM PROFESSOR
GROUP BY TO_CHAR(HIREDATE, 'YYYY')