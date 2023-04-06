package chap98_homework.nc230323;

import java.util.Scanner;

public class _02_middle04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
        str.reverse();
        System.out.println(str);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println(str.charAt(num));
    }
}
