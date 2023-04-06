package advance;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
		Calendar cal = Calendar.getInstance();
		
		cal.set(2020, 4, 8);
		
		System.out.println(cal.get(Calendar.YEAR)+"년"+cal.get(Calendar.MONTH)+"월"+cal.get(Calendar.DATE));
		
		cal.add(Calendar.YEAR, 5);
		System.out.println(cal.get(Calendar.YEAR) + "년 " + 
				(cal.get(Calendar.MONTH)) + "월 " +
				cal.get(Calendar.DATE) + "일");
		//2.
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2023, 3, 24);				
		
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf2.format(today));
	}

}
