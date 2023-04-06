package homework_0321.middle;

import java.util.Scanner;

public class _03_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력");
		String input = sc.nextLine();
		
//		String a = "poweroverwhelming";
		
		//메소드 체이닝
		System.out.println(input.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", ""));
		
	}
}
	