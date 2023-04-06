package chap05_array;

import java.util.Random;
import java.util.Scanner;

public class _04_arrayExample {

	public static void main(String[] args) {
		//가위바위보 10판 진행
		//배열에 각 판의 승무패 저장
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String[] result = new String[10];
		int winCnt = 0, drawCnt=0, loseCnt=0;
		for(int i=0; i<result.length; i++) {		
		System.out.println("0:가위, 1:바위, 2:보 입력: ");
		int com = rand.nextInt(3);
		int input = sc.nextInt();
		if(com == input) {
			System.out.println("비겼습니다");
			result[i] = "draw";
			drawCnt++;
		}
		else if(input == (com+1)%3) {
			System.out.println("이겼습니다");
			result[i] = "win";
			winCnt++;
		}
		else {
			System.out.println("졌습니다");
			result[i] = "lose";
			loseCnt++;
		}
		}
		sc.close();
		for(int i=0; i<result.length; i++) {
			System.out.print(i+1 + "번째 : " + result[i] + "  / ");
		}
		System.out.println(winCnt+", " +drawCnt+ ", " + loseCnt);
	}
}
