package chap15_userfulClass;

import java.util.Scanner;

public class _05_scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.replaceAll("비트","").replaceAll("네이버","").replaceAll("클라우드",""));
//        String[] strArr = str.split("비트");
//        str.substring(str.indexOf('트'));
//        System.out.println(str);
////        strArr = str.split("네이버");
////        strArr = str.split("클라우드");
//        String s1 = String.valueOf(strArr);
//        System.out.println(s1);
    }
}
