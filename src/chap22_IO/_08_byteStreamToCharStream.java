package chap22_IO;

import java.io.*;

public class _08_byteStreamToCharStream {
    public static void main(String[] args) {
        String str = "";

        for(int i = 0; i<20;i++) {
            str = str + String.valueOf(i) + "\n";
        }

        write(str);
        str = read("C:/lecture/hp01.txt");
        System.out.println(str);
    }

    public static void write(String str) {
        try {
            OutputStream os = new FileOutputStream("C:/lecture/hp01.txt");
            //OutputStreamWriter를 이용해서 바이트스트림 -> 문자스트림으로 변환
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }

    public static String read(String file) {
        String reStr = "";
        try {
            InputStream is = new FileInputStream(file);
            Reader reader = new InputStreamReader(is);
//            while (true){
//                int re = reader.read();
//                if(re == -1) break;
//                System.out.print((char)re);
//                reader.close();
//            }
            char[] ch = new char[4096];
            int cnt = 0;
            while (true) {

                cnt = reader.read(ch);
                System.out.println(cnt);
                if (cnt == -1) break;

                for (int i = 0; i < cnt; i++) {
                    reStr += String.valueOf(ch[i]);
                }
            }
            //reStr = new String(ch);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
        return reStr;
    }
}
