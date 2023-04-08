package chap22_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _04_inputStreamRead {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/lecture/ex02.txt");
        byte[] readData = new byte[5];
        while(true){
            int data = is.read(readData);
            //더 이상 읽을 데이터가 없으면 -1리턴
            if(data == -1) break;
            for (int i = 0; i < data; i++) {
                System.out.println(readData[i]);
            }
        }
        is.close();
    }
}
