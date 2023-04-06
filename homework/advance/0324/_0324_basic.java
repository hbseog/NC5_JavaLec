package Homework;

import java.util.Calendar;

public class _0324_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Calendar 객체를 오늘날짜로 생성하세요.
//		1. 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
//		2. 위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤로 변경하고 출력하세요.
//		---------------------------------------------------------------------------

		Calendar cal = Calendar.getInstance();
		
		cal.set(2020, 4, 8);
		//5년 뒤
		cal.add(Calendar.YEAR, 5);
		System.out.println(toString(cal));
		//2달 뒤
		cal.add(Calendar.MONTH, 2);
		System.out.println(toString(cal));
		//3일 뒤
		cal.add(Calendar.DATE, 3);
		System.out.println(toString(cal));
		
		
	}	
		public static String toString(Calendar cal) {
			return cal.get(Calendar.YEAR) + "년 "
					+ cal.get(Calendar.MONTH) + "월 "
					+ cal.get(Calendar.DATE) + "일";
		
			
			
			
		
	}

}
