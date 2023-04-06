package homework_0323.abc;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.
		System.out.println("문장 3개를 입력하세요.");
		StringBuffer str1 = new StringBuffer(sc.nextLine());
		StringBuffer str2 = new StringBuffer(sc.nextLine());
		StringBuffer str3 = new StringBuffer(sc.nextLine());
		System.out.println(str1.append(str2).append(str3));

		//2.gg
		StringBuffer str4 = new StringBuffer(30);
		str4.append("hello");
		System.out.println(str4.capacity());
		System.out.println(str4.length());
		int a = (str4.capacity())-(str4.length());
		for(int i=0; i <a; i++) {
			str4=str4.append("a");
		}
		System.out.println(str4);

		//3.
		double num = 16.459;
		System.out.println((double)Math.round(num*100)/100);
		
		
		//4.
		String str5 = "145.987";
		String str6 = "-563.11";
		
		double convertNum1 = Double.parseDouble(str5);
		//System.out.println(Double.valueOf(convertNum1));
		double convertNum2 = Double.parseDouble(str6);
		
		double sum = convertNum1 + convertNum2;
		System.out.println(sum);
		
		
	}

}
