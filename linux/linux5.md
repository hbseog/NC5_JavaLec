## Mini project

# msa
1. 기능별로 서버분리(was)
2. was는 외부(공인) 네트워크 x
3. https 기반으로 동작함

// sudo apt install certbot
// sudo apt install python3-certbot-nginx(nginx용 certbot모듈)
// sudo certbot --nginx -d +도메인이름+(ssl 생성 및 https 설정)

# RFP

# proxy

# foward proxy

# reverse proxy

# subnet mask

# crontab(시간설정)
- 현재는 잘 사용하지 않지만 리눅스 자체적으로 만든 스케줄링프로그램?
- 경로를 지정할 때는 절대경로로 지정한다.
- 범위지정도 가능하다 ex) 매 분 마다 -> 0-59 * * * * 사용할 명령어

cidr
2진수로 변환시 11111111.11111111.11111111.11111111 총32자리가 나오는데, 그중 앞 16자리를 공통으로 가지는 ip만 접속을 허용한다.
10.41.0.0/16 -> 00001010.00101001 로 시작하는 ip만 허용한다.

runlevel
etc/hosts
netstat -nltp
현재 서버의 포트에 대한 상태를 확인
telnet(GET /) = 웹 브라우저 없이 테스트 서버 안에서 임시로 테스트 가능
//sw architecture