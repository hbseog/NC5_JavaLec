package chap22_IO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class _07_readerReadMethod {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:/lecture/wr01.txt");
        //1. 한 개의 문자씩 입력
        while(true){
            int data = reader.read();
            //입력받을 문자가 없으면 -1
            if(data == -1) break;
            System.out.print((char) data);
        }
        System.out.println();
        //reader도 스트림이기 때문에 한 번 사용하면 다시 파일을 읽어와야한다.
        reader = new FileReader("C:/lecture/wr01.txt");
        char[] chArr = new char[255];
        //2. 문자 배열로 입력
        while (true){
            int cnt = reader.read(chArr);
            if (cnt== -1) break;
            for (int i = 0; i < cnt; i++) {
                System.out.print(chArr[i]);
            }
        }
        reader.close();
    }
}
