# 1.Cloud
1. Iaas 는 H/W 역할을 하는 클라우스 서비스
linux는 suse, ubuntu, centos 등등 여러가지 운영체제를 포함하고있다
ubuntu 사용할 것
LTS -> 안정화 된 버전

2. TCP - 규약에 맞게 통신 -> (신뢰성이 높다, 지속적인 서비스)
UDP - 클라이언트에서 일방적으로 보내면 서버에서 알아서 받아야됨 -> (속도가 빠르다, 지속적이지 않다)
Port -> 작업에 따라 포트에 규약이 있다. ex -> 80번: 웹, 22 -> ssh
Natmask - ip주소 필터링 ex -> 127.0.(Natmask) = '127.0.~' 으로 시작하는 ip 허용

# 2.ubuntu
1. ssh 프로그램을 이용해서 서버에 접속
root와 초기 비밀번호를 입력하여 로그인
리눅스 계열의 os에서는 ssh명령어로 로그인 가능
root(사용자명)@test1(호스트):~(위치)#or$(권한)
위치
- ~: 홈 디렉토리
- /: root 디렉토리(최상위 디렉토리)
- .: 현재 위치 디렉토리
- ..: 부모 디렉토리
- #: 관리자
- $: 일반 사용자

2. 명령어
pwd: 현재 위치를 확인
cd: 디렉토리 이동 명령 -> ex: cd .. : 부모 디렉토리로 이동
ls: 현재 디렉토리의 파일 확인

3. id: 사용자 id 확인
uid: 유저 아이디
gid: 그룹 아이디
groups: 해당 유저가 소속된 모든 그룹을 표시

who: 접속되어있는 리눅스 사용자 검색

w: 사용자들에 대한 정보

파란색: 디렉토리
하늘색: 심볼릭링크

tab키를 이용한 자동완성

## 3.사용자 생성
adduser 이름
Adding new group `ubuntu' (1001) ...
// 사용자에 대한 그룹을 만듦
Adding new user `ubuntu' (1001) with group `ubuntu' ...
// 해당 그룹에 사용자 부여
Creating home directory `/home/ubuntu' ...
// 사용자의 홈디렉토리
Copying files from `/etc/skel' ...
// 사용자가 사용할 파일

리눅스에서의 모든 리소스는 파일로 취급할 수 있다.
ex: 사용자, 그룹, 디바이스 ...

프로세스(job[작업]): 실행중인 프로그램
프로세스는 포그라운드, 백그라운드로 나눌 수 있다.
포그라운드: 사용자와 직접적으로 연동될 수 있는 프로세스
백그라운드: 사용자와 직접적으로 연동할 수는 없지만 뒤에서 실행중인 프로세스
사용자에 따라 프로세스를 분류할 수 있다. -> root, user

# 명령어
- ps 사용자에 대한 정보
- -ef: 현재 작동중인 프로세스 조회
htop
image.png
PID: 프로세스의 고유번호
PPID: PID의 부모

SHELL: 프로그램을 실행하여 프로세스화 시키는 프로그램
일반적인 프로세스의 PPID는 SHELL이 된다.
BASH: SHELL의 종류
pkill: 프로세스 종료
kill -9 PID
grep: 조회 명령어에 옵션으로 사용하면 검색한 단어가 포함된 행만 조회된다.
//passwd: 사용자의 아이디와 패스워드를 저장하는 파일
패스워드 uid gid 홈디렉토리 실행되는shell
cat: 파일을 확인하는 명령어
more: 파일을 페이지 별로 확인하 수 있는 명령어
less: 지나간 내용들도 다시 볼 수 있는 명령어

su - (uid): 다른 사용자로 로그인 root에서 사용하면 패스워드 입력없이 로그인 가능
'-'를 제외하면 해당 유저의 권한만 가져옴

cp: 파일을 복사하는 명령 ex) cp /etc/protocols ~
권한 inode 파일소유자 파일소유그룹 용량 생성날짜or접근날짜
파일명 앞에 .을 붙히면 ls로 보이지 않는다. 확인하기위해선 옵션 필요
-l, -a 두 옵션을 붙여서도 사용 가능

mv: 파일 이동 및 이름 변경 -> mv 변경 및 이동할 파일 이동할 위치 및 변경할 파일명

rm: 파일 삭제 -> rm 파일명
rm -r 디렉토리명

cat으로 txt파일 작성하는 법
cat > 파일명
(내용 작성)
ctrl + d

디렉토리 명령어
mkdir: 디렉토리 생성 -> mkdir 디렉토리명
rmdir: 디렉토리 삭제 - mkfir 디렉토리명 / 디렉토리 안에 내용이 있을 경우 rm -rf 디렉토리명(해당 디렉토리에 모든 파일을 한 번에 다 지워버리는 명령어 -조심히 사용할 것-)

(디렉토리는 rm -r 명령어로도 지울 수 있다.)

패스워드 변경: passwd 유저명

deluser: 유저 삭제 -> deluser guest

https 인증서 ssl??
scp 명령어
형상관리 github

devide and conquer
package management
vi editor
T4GTe8PgNRa