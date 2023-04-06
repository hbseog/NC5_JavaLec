package homework_0321.middle;

import java.util.Scanner;

public class _01_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력");
		String input = sc.nextLine();
		int inputLength =input.length();
		
		
//		char ch = input.charAt(inputLength/2);
//		char ch1 = input.charAt((inputLength/2)-1);
//		
//		if(inputLength%2==0) {
//			System.out.print(ch1);
//		System.out.print(ch);
//		} else {
//			System.out.println(ch);
//		}
		// 비둘기 비트캠프
		//	012	0123
		String answer = "";
		if(inputLength%2==0) {
			answer = input.substring(inputLength/2-1,inputLength/2+1);
		} else if (inputLength%2!=0) {
			answer = input.substring(inputLength/2, inputLength/2+1);
		}
		System.out.println(answer);
	}
}
