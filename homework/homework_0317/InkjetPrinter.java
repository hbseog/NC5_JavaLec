package homework_0317;

public class InkjetPrinter extends Print {
	public int inkBalance = 100;

	public void print() {
		while (true) {
			System.out.println("잉크젯 프린터로 출력할 매수를 입력하세요.");
			printCount = sc.nextInt();
			if(paperBalance < printCount && inkBalance == 0) {
				System.out.println("남은 출력용지나 잉크가 부족합니다.");
				break;
			}
			System.out.printf("잉크젯 프린터로 %d장 출력합니다.\n", printCount);
			paperBalance -= printCount;
			inkBalance -= printCount;
			System.out.printf("남은 매수: %d, 남은 잉크: %d\n\n",paperBalance, inkBalance);
		}
	}
}
