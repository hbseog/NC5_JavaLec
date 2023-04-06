package homework_0315;

import java.util.Random;
import java.util.Scanner;

public class _homework_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
		   while문내에 조건문을 넣어주면 됨

		2. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
		   그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요

		3. 구구단을 이렇게 출력하세요
		 2x1=2 3x1=3...9x1=9
		 2x2=4
		 ...
		 2x9=18........9x9=81

		4. 가위, 바위, 보 게임을 만드세요.
		com에 0~2까지의 랜덤값을 발생시키고
		(0:가위, 1:바위, 2:보)
		사용자가 가위, 바위, 보를 입력하여
		com과의 승무패를 출력하세요.
		(예시) com = 2, 사용자가 바위를 입력하면 => 졌습니다.
		com=1, 사용자가 바위를 입력하면 => 비겼습니다.
		com=0, 사용자가 바위를 입력하면 => 이겼습니다.
*/
		/*//1.
		int num = 0;
		while(num<10) {
			num++;
			if(num % 2 == 0) System.out.println(num);
			
		}
		*/
		/*//2.
		int sum=0;
		for(int i=1; i<=1000; i++) {
			if(i%2==0 && i%7==0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("2와 7의 배수의 합: " + sum);
		*/
		
		//3.
		/*
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j + " x " + i + " = " + j*i + " ");
			}
			System.out.println();
		}
		*/
		//4.
		/*
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("0:가위, 1:바위, 2:보 입력: ");
		int com = rand.nextInt(3);
		int input = sc.nextInt();
		if(com == input) {
			System.out.println("비겼습니다");
		}
		else if(input == (com+1)%3) System.out.println("이겼습니다");
		else System.out.println("졌습니다");
		*/
	}
}