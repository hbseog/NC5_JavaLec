package chap22_IO;

import java.io.*;

public class _05_fileCopybyByteStream {
    public static void main(String[] args) throws IOException {
        String originFileNm = "C:/lecture/abc.png";
        String copyFileNm = "C:/lecture/abcCopy2.png";

        InputStream is = new FileInputStream(originFileNm);
        OutputStream os = new FileOutputStream(copyFileNm);
        byte[] readData = new byte[1024];
        while (true){
            int cnt = is.read(readData);
            if (cnt==-1) break;
            os.write(readData);
        }
        //java9부터 transferTo 메소드가 생김
        is.transferTo(os);
        os.flush();
        is.close();
        os.close();
    }
}
