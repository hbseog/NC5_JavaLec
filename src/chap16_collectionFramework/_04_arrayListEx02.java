package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_arrayListEx02 {
    public static void main(String[] args) {
        //사용자가 문자열을 입력, 길이를 10씩 잘라서 ArrayList에 저장, 남은 문자열의 길이가 10보다 작으면 남은 문자열을 ArrayList에 저장
        //ex) abcdefghijklmnop
        //[abcdefghij], [klmnop]
        Scanner input = new Scanner(System.in);
        ArrayList<StringBuilder> str = new ArrayList<StringBuilder>();
        StringBuilder a = new StringBuilder(input.nextLine());

        for (int i = 0; i <a.length(); i+=10) {
            if (a.length()-i < 10 ){
                str.add(new StringBuilder(a.substring(i, a.length())));
            }
            else str.add(new StringBuilder(a.substring(i, i + 10)));
        }
        System.out.println(str);
    }
}
