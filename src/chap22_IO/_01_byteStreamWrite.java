package chap22_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _01_byteStreamWrite {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/lecture/ex01.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(os, Charset.defaultCharset());

        //1. byte를 1byte씩 출력
        byte num1 = -128, num2 = 127, num3 = 0;
        os.write(num1);
        os.write(num2);
        os.write(num3);
        
        //1-1. byte 배열로 출력

        //index ==1~3
        //2. 버퍼 비워주기
        os.flush();;
        //3. 스트림 메모리에서 해제
        os.close();
    }
}
