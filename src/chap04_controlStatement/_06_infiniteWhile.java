package chap04_controlStatement;
import java.util.Scanner;
public class _06_infiniteWhile {

	public static void main(String[] args) {

		//스캐너 객체
		Scanner sc = new Scanner(System.in);
		//스캐너 사용 시 next메소드를 혼룔하여 사용하는 것은 좋지 않다 ex) nextInt, nexLine : 하나이ㅡ next메소드만 사용하여 형변환 해주는 것이 좋다.
		while(true) {
			System.out.println("1은 종료, 나머지는 반복");
			String inputStr = sc.nextLine();
			if (inputStr.equals("1")) {
				break;
			}
			System.out.println(inputStr);
		}
	}

}
