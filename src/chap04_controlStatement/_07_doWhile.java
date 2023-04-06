package chap04_controlStatement;

public class _07_doWhile {

	public static void main(String[] args) {
		//do{} 블록의 소스코드는 무조건 1회 실행된다.
		//조건식이 true면 다시 반복 실행
		do {
			System.out.println("무조건 1회 실행");
		} while (false);
		int i = 1;
		
		do {
			if(i % 3 == 0)
			System.out.println(i);
		} while (++i <= 20);
	}

}
