package chap22_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _03_inputStreamRead {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/lecture/ex01.txt");
        while(true){
            //byte로 입력한 데이터라 byte로 받아야 부호가 정획하게 출력됨
            byte data = (byte) is.read();
            //더 이상 읽을 데이터가 없으면 -1리턴
            if(data == -1) break;
            System.out.println(data);
        }
        is.close();
    }
}
