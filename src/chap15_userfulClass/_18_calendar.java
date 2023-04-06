package chap15_userfulClass;

import java.util.Calendar;

public class _18_calendar {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        String[] days = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        //HOUR는 오전, 오후 상관없이 0~11로 표시
        System.out.println("현재 시간은"+today.get(Calendar.HOUR) + ":" + today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));
        //HOUR_OF_DAY는 0~23시까지 표시
        System.out.println("현재 시간은 "+today.HOUR_OF_DAY);
        //오전(0), 오후(1)
        System.out.println(today.get(Calendar.AM_PM));
        System.out.println("올해 년도는: " + today.get(Calendar.YEAR));
        //월은 0부터 시작 0(1월)~11(12월)
        System.out.println("현재 월은: " + (today.get(Calendar.MONTH)+1));
        System.out.println("이번달이 몇 번째 주 인지: "+today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("이번달이 올해의 몇 번째 주 인지: "+today.get(Calendar.WEEK_OF_YEAR));
        //DAY_OF_WEEK는 1부터 시작 1(일요일)~7(토요일)
        System.out.println("오늘의 요일은: "+today.get(Calendar.DAY_OF_WEEK));
        Calendar oneDay = Calendar.getInstance();
        oneDay.set(2023,2,24,12,3,30);
        System.out.println("무슨요일: "+days[oneDay.get(Calendar.DAY_OF_WEEK)]);
        System.out.println("요일은: "+oneDay.get(Calendar.DAY_OF_WEEK));
        System.out.println("oneDay는" + oneDay.get(Calendar.YEAR)+"년 "+(oneDay.get(Calendar.MONTH)+1)+"월"+oneDay.get(Calendar.DATE)+"요일");
        System.out.println(toString(oneDay));
    }
    public static String toString(Calendar cal){
        return cal.get(Calendar.YEAR)+"년 "+(Calendar.MONTH+1)+"월"+(Calendar.DAY_OF_WEEK)+"일";
    }
}
