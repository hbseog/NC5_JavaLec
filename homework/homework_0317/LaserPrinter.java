package homework_0317;

import java.util.Scanner;

public class LaserPrinter extends Print{
	public int tonerBalance = 100;
	public void print() {
		while (true) {
			System.out.println("레이져 프린터로 출력할 매수를 입력하세요.");
			printCount = sc.nextInt();
			if(paperBalance < printCount && tonerBalance == 0) {
				System.out.println("남은 출력용지나 토너가 부족합니다.");
				break;
			}
			System.out.printf("레이져 프린터로 %d장 출력합니다.\n", printCount);
			paperBalance -= printCount;
			tonerBalance -= printCount;
			System.out.printf("남은 매수: %d, 남은 잉크: %d\n\n",paperBalance, tonerBalance);
		}
	}
}
