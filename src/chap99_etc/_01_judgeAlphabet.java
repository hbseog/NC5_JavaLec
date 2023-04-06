package chap99_etc;

import java.io.IOException;

public class _01_judgeAlphabet {

	public static void main(String[] args) throws IOException {
		
		System.out.print("영문자 하나를 입력하세요: ");
		int inputUni = System.in.read();
		
		//1. 사용자 입력값 받기
		//read(): int 타입 값을 반환하고 입력값을 문자로 인식.
		//		  리턴되는 int 타입의 값은 문자의 유니코드(10진수)
		/*if(조건1) {
			조건1이 참(ture)일 경우레만 동작
		}
		else if(조건2) {
			조건1은 거짓(false)이고 조건2가 참(true)인 경우 동작
		}
		else if(조건3) {
			
		}
		else {
			위의 모든 조건이 거짓(false)일 때 실행
		}
		*/
		//대문자 A유니코드 65 알파벡의 개수 26개
		//소문자 a유니코드 97
		if(inputUni >= 65 && 90 >= inputUni) {
			System.out.println("대문자 입니다.");
			//System.out.println((char)inputUni);
			//대문자로 들어왔을 때는 해당 문자를 소문자로 변경해서 출력
			inputUni += 32;
			System.out.println("소문자 변환: " + (char)inputUni);
		}
		else if(inputUni >= 97 && 122 >= inputUni) {
			System.out.println("소문자 입니다.");
			//System.out.println((char)inputUni);
			//소문자로 들어왔을 때는 해당 문자를 대문자로 변경해서 출력
			inputUni -= 32;
			System.out.println("대문자 변환: " + (char)inputUni);
		}
		else
			System.out.println("잘못 입력하셨습니다.");
		
	}

}
