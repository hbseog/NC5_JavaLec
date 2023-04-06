package chap99_etc;

import java.util.Random;
import java.util.Scanner;

public class _05_inputNum {

	public static void main(String[] args) {
		int in;
		Random rand = new Random();
		int com = rand.nextInt(200)+1;
		//컴퓨터는 변수에 1~200 랜덤값		
			while(true) {
				while(true) {
				System.out.println("1~200사이의 숫자를 입력하세요. : ");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				if(com != num) {
					System.out.println("틀렸습니다 다시 입력하세요.");
					System.out.println(com);
				}
				else {
					System.out.println("맞췄습니다");
					System.out.println("계속 하시려면 1 입력 / 그만 하시려면 다른 키 입력");
					Scanner sc2 = new Scanner(System.in);
					in = sc2.nextInt();
					if(in!=1) break;
					Random rand2 = new Random();
					com = rand2.nextInt(200)+1;
					}
				sc.close();
				}
				if(in!=1) break;
			}
			//사용자 입력 정수 받기 nextInt
			//201이면 while문 종료
			//com == input
			//맞췄습니다.
			//계속 하시겠습니까?
			//1 => com 새로운 난수 1~200 발생
			//틀렸습닏. 다시 입력하세요
			
	}	
}
