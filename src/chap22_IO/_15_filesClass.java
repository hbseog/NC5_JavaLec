package chap22_IO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _15_filesClass {
    public static void main(String[] args) throws IOException {
        String data = "이름: 홍길동\n번호: 01011111111";
        
        //1. Path객체 생성
        Path path = Paths.get("C:/lecture/Test/filesEx01.txt");

        //2. 파일 생성 및 데이터 저장
        Files.writeString(path, data, Charset.forName("UTF-8"));
        
        //3. 파일 정보 출력
        // .txt => text/plain
        // .jpg, .jpeg => image/jpeg
        // .gif => image/gif
        System.out.println(Files.probeContentType(path));
        //size => byte단위로 파일 크기를 가져오는 메소드
        System.out.println(Files.size(path));

        //4. 파일 읽기
        String content = Files.readString(path,Charset.forName("UTF-8"));
        System.out.println(content);
    }
}
