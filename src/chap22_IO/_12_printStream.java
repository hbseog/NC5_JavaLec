package chap22_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class _12_printStream {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("C:/lecture/printSteam.txt"));
            byte[] byteArr = {1,2,3,4,5,127};
            for (int i = 0; i < byteArr.length; i++) {
                //출력 스티림에는 값을 찍어볼 수 있는 기능이 없지만 printStream/ printWriter를 이용하면 출력될 값을 출력형식으로 같이 내보내준다..
                //OutputStream os - new FileOutputStream("파일");
                //os.print/println() => 기능이 없다.
                //오직 printStream만 가지고 있다.
                //값을 내보낼 때 print메소드를 호출한 부분도 함께 출력된다. -> 콘솔이 아닌 해당 파일에 출력된다.
                ps.println(byteArr[i]);
                //System.out.println() -> printStream의 메소드인 out를 이용하여 콘솔에 값을 출력하는 방식

            }
            ps.write(byteArr);
            ps.flush();
            ps.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
