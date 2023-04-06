package chap99_etc;

import java.io.IOException;
import java.util.Scanner;

public class _02_printAlphabet {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.print("\'1\' 입력시 입력부터 z까지 출력  /  \'2\' 입력시 a부터 입력까지출력 ");
		char chose = sc.nextLine().charAt(0);
		System.out.print("영문자 하나를 입력하세요: ");
		char inputUni = sc.nextLine().charAt(0);
		switch (chose) {
		case '1':
			inputToZ((char) inputUni);
			break;
		case '2':
			aToInput((char) inputUni);
			break;
		}

	}

	public static void inputToZ(char a) {
		if (a >= 65 && 90 >= a) {
			System.out.println("대문자 입니다.");
			// 입력된 문자가 대문자면 입력된 문자부터 Z까지 출력
			for (int i = a; i <= 90; i++) {
				System.out.print((char) i + " ");
			}

		} else if (a >= 97 && 122 >= a) {
			System.out.println("소문자 입니다.");
			// 입력된 문자가 소문자면 입력된 문자부터 z까지 출력
			for (int i = a; i <= 122; i++) {
				System.out.print((char) i + " ");
			}

		} else
			System.out.println("잘못 입력하셨습니다.");
	}

	public static void aToInput(char a) {
		if (a >= 65 && 90 >= a) {
			System.out.println("대문자 입니다.");
			// 입력된 문자가 대문자면 입력된 문자부터 Z까지 출력
			for (int i = 65; i <= a; i++) {
				System.out.print((char) i + " ");
			}
		}

		// 대문자 a부터 입력된 문자까지 출력
		else if (a >= 97 && 122 >= a) {
			System.out.println("소문자 입니다.");
			// 입력된 문자가 대문자면 입력된 문자부터 Z까지 출력
			for (int i = 97; i <= a; i++) {
				System.out.print((char) i + " ");
			}
		} else
			System.out.println("잘못 입력하셨습니다.");
	}
}
