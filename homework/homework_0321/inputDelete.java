package homework_0321;

import java.util.Scanner;

public class inputDelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자입력");
		String input = sc.nextLine();
		
		
		// 메소드 체이닝
		System.out.println(input.replaceAll("비트", "").replaceAll("네이버", "").replaceAll("클라우드", ""));
		//테스트용 문자열
//		String a = "가비트나네이버다라마바클라우드";
		
//		String charsToRemove = "비트네이버클라우드비"; // (1)
//		String charsToRemove = "네이버"; // (1)
//		String charsToRemove = "클라우드"; // (1)
		
		
//		for(char c :  charsToRemove.toCharArray()) { // (1)
//			a = a.replace(String.valueOf(c), ""); // (1)
//		} // (1)
//		System.out.println(a); // (1)
		
//		a = a.replaceAll("비트", "");
//		a = a.replaceAll("네이버", "");
//		a = a.replaceAll("클라우드", "");
		
//		System.out.println(a.replaceAll("비트",""));
//		System.out.println(a.replaceAll("네이버",""));
//		System.out.println(a.replaceAll("클라우드",""));
//		System.out.println(a);
		
		
	}
}
