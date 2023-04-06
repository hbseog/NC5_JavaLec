package chap02_variables;

public class _11_varVaraibles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var str = "hello";
		//원시타입 불가능
		System.out.println("ste의 타입: " + str.getClass().getName());
		//str=10;
		
		//원시타입의 래퍼클래스
		//int => Integer
		//long => Long
		var num1 = 100;
		
		System.out.println(((Object)num1).getClass().getName());
	}

}