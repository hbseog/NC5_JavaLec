package chap15_userfulClass;

import java.util.Scanner;

public class _10_MathEx {
    public static void main(String[] args) {
        //사용자가 5개 정수입력받아서 배열에 저장
        //Math.max와 Math.min을 이용하여 최소값, 최대값 구하기
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int max = num[0], min = num[0];

        for (int i : num) {
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        System.out.println("최대값: " + max + " / 최소값: " + min);
        sc.close();


    }
}
