# 1. RunLevel
(시스템 관리를 용이하게 하기 위함)
- 0~6(총 7개의 런 레벨이 있음)
    0 (halt) 
        : 시스템 중지, 기본값으로 설정 불가
    1 (single user mode) 
        : 단일 사용자 모드
    2 (multiuser,without NFS) 
        : 네트워크를 사용하지 않는 다중 사용자 모드
    3 (Full multiuser mode)
        : 네트워크를 지원하는 다중 사용자 모드
    4 (Unused)
        : 사용되지 않는 런레벨이지만 사용자가 정의해서 사용 가능
    5 (Xll)
        : X Window를 사용하는 다중 사용자 모드(그래픽 인터페이스)
    6 (Reboot)
        : 시스템을 재기동할 때 사용, 기본값으로 설정불가
- ftpd
- sshd
- httpd

# 2. 리눅스 네트워크
# 3. Http Web Server
# 4. Shall Script
# 5. crontap
. rc (run command : 실행명령)
. Front End Framework
. 디자인 패턴

# 실습해보기
## 리눅스 서버구축하기
- 기본 사용자 생성(sudo사용)
- 웹 서버 설치
- 도메인 연결

# FrontEnd
- HTML
    - React.js
    -> javascript 라이브러리
    - React 사용자 인터페이스 만들기
- JS(자바 스크립트)
- CSS(문자 스타일 디자인)
    - tailwindcss 라이브러리 참조하기

- 도메인 인증 하는 법
하나의 도메인 인증할 때 : ubuntu@linux:/etc/nginx/sites-enabled$ sudo certbot --nginx -d 도메인주소 
여러개 인증할 때 : ubuntu@linux:/etc/nginx/sites-enabled$ sudo certbot --nginx -d 도메인주소 -d 도메인주소 -d 도메인주소...

- crontab 
 ex) ubuntu@linux:~$ sudo crontab -l
-> 
MAILTO=""
30 06 * * * /usr/sbin/nsight_updater > /tmp/.nu.log 2> /tmp/.nu_err.log