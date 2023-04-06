package chap02_variables;

public class _05_charType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. char타입의 변수 선언 및 초기화
		char ch1 = 'A', ch2 = 65, ch3 = '\u0041';
		char ch4 = '가', ch5 = 44032, ch6 = '\uAC00';
		
		//2. 문자를 유니코드 10진수로 변환
		char ch7 = '자';
		//해당 char 타입의 변수를 int변수에 저장하면 10진수 유니코드 값을 추출
		int unicode = ch7;
		//형변환 char타입 변수를 ch7을 int타입으로 변경
		System.out.println((int)ch7);
		
		//3. 빈 칸을 사용할 때는 space 값을 추가해야 된더.
		//char ch8 = ''; //그냥 빈칸을 변수의 값으로 지정하면 에러 발생.
		char ch9 = ' ';
		
		//4. char 타입의 변수 출력
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
		System.out.println(unicode);
	}

}
