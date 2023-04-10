package chap22_IO;

import java.io.File;
import java.io.IOException;

public class _14_fileClass {
    public static void main(String[] args) throws IOException {
        //1. 파일 객체 생성
        File newDirectory = new File("C:/lecture/Test");
        File newFile = new File("C:/lecture/FileEx01.txt");

        //2. 파일, 폴더 생성
        if (!newDirectory.exists()) newDirectory.mkdir();
        if (!newFile.exists()) newFile.createNewFile();

        //3. 파일 객체 생성
        File directory = new File("C:/lecture");
        File deleteFile = new File("C:/lecture/name.txt");
        File[] fileArr = directory.listFiles();
        for (File f : fileArr) {
            System.out.println(f.getName());
        }
        System.out.println("--------------------");
        boolean isDeleted = deleteFile.delete();
        if (isDeleted) System.out.println("파일 삭제 완료");
        else System.out.println("파일 삭제 실패");
    }
}

