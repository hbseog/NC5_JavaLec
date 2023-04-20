--1)student 테이블 구조를 검색해라
DESCRIBE EMP;

--2)course 테이블 구조를 검색해라
DESCRIBE CORURSE;

--3)professor 테이블 구조를 검색해라
DESCRIBE PROGESSOR;

--4)score 테이블 구조를 검색해라
DESCRIBE SCORE;

--5) 모든 학생의 정보를 검색해라
SELECT * FROM STUDENT;

--7) 모든 과목의 정보를 검색해라
SELECT * FROM COURSE;

--8) 기말고사 시험점수를 검색해라
SELECT RESULT FROM SCORE;

--9) 학생들의 학과와 학년을 검색해라
SELECT MAJOR, SYEAR FROM STUDENT;

--10) 각 과목의 이름과 학점을 검색해라
SELECT CNAME, ST_NUM FROM COURSE;

--11) 모든 교수의 직위를 검색해라
SELECT ORDERS FROM PROFESSOR;


-----------------------------------------

--1) 각 학생의 평점을 검색하라(별칭을 사용)
SELECT SNAME, AVR AS 평점 FROM STUDENT;

--2) 각 과목의 학점수를 검색하라(별칭을 사용)
SELECT CNAME, ST_NUM AS 학점 FROM COURSE;

--3) 각 교수의 지위를 검색하라(별칭을 사용)
SELECT PNAME,ORDERS FROM PROFESSOR;

--4) 급여를 10%인상했을 때 연간 지급되는 급여를 검색하라(별칭을 사용)
SELECT SAL*1.1 AS 인상급여 FROM EMP;

--5) 현재 학생의 평균 평점은 4.0만점이다. 이를 4.5만점으로 환산해서 검색하라(별칭을 사용)
SELECT ROUND(AVR*1.125,2) AS "4.5만점" FROM STUDENT;



--------------------------------------------------------------
--1) '__학과인 __학생의 현재 평점은 __입니다' 형태로 학생의 정보를 출력하라
SELECT MAJOR||' 학과인 ' || SNAME || '학생의 현재 평점은 ' || TO_CHAR(AVR, 'FM9990.99')|| '입니다.' AS 평점정보 FROM STUDENT ;

--2) '__과목은 __학점 과목입니다.' 형태로 과목의 정보를 출력하라
SELECT CNAME||' 과목은 ' ||ST_NUM||'학점 과목입니다.' FROM COURSE;

--3) '__교수는 __학과 소속입니다.' 형태로 교수의 정보를 출력하라
SELECT PNAME || ' 교수는 '||PROFESSOR.SECTION||' 학과 소속입니다.' FROM PROFESSOR;

--4) 학교에는 어떤 학과가 있는지 검색한다(학생 테이블 기반으로 검색한다)
SELECT DISTINCT MAJOR AS 학과 FROM STUDENT;

--5) 학교에는 어떤 학과가 있는지 검색한다(교수 테이블 기반으로 검색한다)
SELECT DISTINCT SECTION AS 학과 FROM PROFESSOR;

--6) 교수의 지위는 어떤 것들이 있는지 검색한다
SELECT DISTINCT ORDERS FROM PROFESSOR;


------------------------------------------------------


--1) 성적순으로 학생의 이름을 검색하라
SELECT SNAME FROM STUDENT ORDER BY AVR DESC ;

--2) 학과별 성적순으로 학생의 정보를 검색하라
SELECT * FROM STUDENT
ORDER BY MAJOR, AVR DESC ;

--3) 학년별 성적순으로 학생의 정보를 검색하라
SELECT * FROM STUDENT
ORDER BY SYEAR, AVR DESC ;

--4) 학과별 학년별로 학생의 정보를 성적순으로 검색하라
SELECT * FROM STUDENT
ORDER BY MAJOR,SYEAR, AVR DESC ;

--5) 학점순으로 과목 이름을 검색하라
SELECT CNAME FROM COURSE ORDER BY ST_NUM DESC ;

--6) 각 학과별로 교수의 정보를 검색하라
SELECT * FROM PROFESSOR ORDER BY SECTION;

--7) 지위별로 교수의 정보를 검색하라
SELECT * FROM PROFESSOR ORDER BY ORDERS;

--8) 각 학과별로 교수의 정보를 부임일자 순으로 검색하라
SELECT * FROM PROFESSOR ORDER BY HIREDATE;


------------------------------------------------

--1) 화학과 학생을 검색하라
SELECT * FROM STUDENT WHERE MAJOR='화학';

--2) 평점이 2.0 미만인 학생을 검색하라
SELECT * FROM STUDENT WHERE AVR<2;

--3) 관우 학생의 평점을 검색하라
SELECT AVR FROM STUDENT WHERE SNAME = '관우';

--4) 정교수 명단을 검색하라
SELECT * FROM PROFESSOR WHERE ORDERS = '정교수';

--5) 화학과 소속 교수의 명단을 검색하라
SELECT * FROM PROFESSOR WHERE SECTION = '화학';

--6) 송강 교수의 정보를 검색하라
SELECT * FROM PROFESSOR WHERE PNAME = '송강';

--7) 학년별로 화학과 학생의 성적을 검색하라
SELECT AVR FROM STUDENT WHERE MAJOR = '화학' ORDER BY SYEAR

--8) 2000년 이전에 부임한 교수의 정보를 부임일순으로 검색하라
SELECT * FROM PROFESSOR WHERE HIREDATE < '2000-01-01';

--9) 담당 교수가 없는 과목의 정보를 검색하라
SELECT * FROM COURSE WHERE PNO IS NULL ;


------------------------------------------------------

--1) 유공과와 생물과, 식영과 학생을 검색하라
SELECT * FROM STUDENT WHERE MAJOR = '유공' OR MAJOR = '생물' OR MAJOR = '식영';

--2) 화학과가 아닌 학생중에 1학년 학생을 검색하라
SELECT * FROM STUDENT WHERE MAJOR!='화학' AND SYEAR = 1;

--3) 물리학과 3학년 학생을 검색하라
SELECT * FROM STUDENT WHERE MAJOR = '물리' AND SYEAR = 3;

--4) 평점이 2.0에서 3.0사이인 학생을 검색하라
SELECT * FROM STUDENT WHERE AVR >=2.0 AND AVR < 3;

--5) 교수가 지정되지 않은 과목중에 학점이 3학점인 과목을 검색하라
SELECT * FROM COURSE WHERE PNO IS NULL  AND ST_NUM = 3;

--6) 화학과 관련된 과목중 학점이 2학점 이하인 과목을 검색하라
SELECT * FROM COURSE WHERE CNAME LIKE '%화학%' AND ST_NUM<=2;

--7) 화학과 정교수를 검색하라
SELECT * FROM PROFESSOR WHERE SECTION = '화학' AND ORDERS = '정교수';

--8) 물리학과 학생중에 성이 사마씨인 학생을 검색하라
SELECT * FROM STUDENT WHERE MAJOR = '물리' AND SNAME LIKE '사마%';

--9) 성과 이름이 각각 1글자인 교수를 검색하라
SELECT * FROM PROFESSOR WHERE PNAME LIKE '__';


DESCRIBE STUDENT;

desc schema.STUDENT;



