package homework_0315;

import java.util.Scanner;

public class _homework_advence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. 돈의 액수를 입금하세요
		   입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
		   출력 개수는 단위가 큰 것 순서로 계산합니다
		   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.

		2. 369게임을 작성합니다.
		   1~99까지의 정수를 입력받고
		   3,6,9중 하나가 있으면 "박수짝"을 출력하고
		   2개가 있으면 "박수짝짝"을 출력하세요
		   예를 들어 13은 "박수짝"
		   36인 경우는 "박수짝짝"을 출력하면 됩니다.

		3. AB + BA = 99 를 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하세요.

		4. 다음과 같이 출력하세요.
		    *
		   ***
		  *****
		 *******
		*********
*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("돈 입력: ");
		int money = sc.nextInt();
		int cal = 0;
		System.out.print("<오만원 ");
		cal = money / 50000;
		money %= 50000;
		System.out.print(cal + "매, 만원 ");
		cal = money / 10000;
		money %= 10000;
		System.out.print(cal + "매, 오천원 ");
		cal = money / 5000;
		money %= 5000;
		System.out.print(cal + "매, 천원 ");
		cal = money / 1000;
		money %= 1000;		
		System.out.print(cal + "매, 500원 ");
		cal = money / 500;
		money %= 500;
		System.out.print(cal + "개, 100원 ");
		cal = money / 100;
		money %= 100;
		System.out.print(cal + "개, 50원 ");
		cal = money / 50;
		money %= 50;
		System.out.print(cal + "개, 10원 ");
		cal = money / 10;
		System.out.print(cal + "개 입니다> ");
		*/
		/*
		Scanner sc = new Scanner(System.in);
 	int[] coinUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
    int money = sc.nextInt();
    System.out.println("money=" + money);
    for (int i = 0; i < coinUnit.length; i++) {
        System.out.println(coinUnit[i]+"원: "+ money / coinUnit[i]);
        money%= coinUnit[i];
        55555 / 50000 = 5만원권 1장
    }*/
		 /*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력(1~99)");
		int cal = 0, clap = 0;
		int num = sc.nextInt();
		cal = num % 10;
		if(cal%3==0) clap++;
		num -= cal;
		if(num%30==0) clap++;
		if(clap==0)System.out.println("꽝");
		else {
			System.out.print("박수");
			for(int i=0; i<clap; i++) {
				System.out.print("짝");
			}
		}
		*/
		/*
		for(int A=0; A<10; A++) {
			for(int B=0; B<10; B++) {
				if((A*10+B) + (B*10+A) == 99 )System.out.println(A + ", " + B);
			}
		}
		*/
		/*
		for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            
            
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
		
            
            System.out.println();
        }*/
		/*
		for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                // 윗 부분
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
            } else {
                // 아래 부분
                for (int j = 5; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * (9 - i) - 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println(); // 줄바꿈
        }
        */
	}
}
