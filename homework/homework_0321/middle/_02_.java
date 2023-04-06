package homework_0321.middle;

import java.util.Scanner;

public class _02_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력");
		String input = sc.nextLine();
		
//		String str = "apple";
		System.out.println(countChar(input, '가'));
		System.out.println(countChar(input, '바'));
	}
//		int ga = 0;
//		int ba = 0;
//		
//		for(int i = 0;i<input.length();i++) {
//		if(input.contains("가")) {
//			System.out.println("가 발견");
//		}
//		if(input.contains("바")){
//			System.out.println("바 발견");
//		}
//		}
//		System.out.println("'가'의 개수 : " + ga);
//		System.out.println("'바'의 개수 : " + ba);
	
	/*
		public static int countChar(String str, char ch) {
			int count = 0;
			for(int i = 0; i < str.length();i++) {
				if(str.charAt(i) == ch) {
					count++;
				}
			}
			
			return count;
			
		}
	*/
	
		public static int countChar(String str, char ch) {
			return str.length() - str.replace(String.valueOf(ch), "").length();
		}
	}


