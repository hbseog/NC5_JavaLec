package homework_0324;

import java.util.Scanner;

public class advance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세용");
        StringBuilder strb = new StringBuilder(sc.next());
        for(int i = 0; i<strb.length()-1; i++){
            if(strb.charAt(i)==strb.charAt(i+1)){
                strb.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.println(strb);
    }
}
