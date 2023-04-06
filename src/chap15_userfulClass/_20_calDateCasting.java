package chap15_userfulClass;

import java.util.Calendar;
import java.util.Date;

public class _20_calDateCasting {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2018,5,7);

        //Calendar => Date로 형 변환
        Date d1 = new Date(cal1.getTimeInMillis());
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(d1);
        System.out.println(d1);
        System.out.println(cal2.get(Calendar.DAY_OF_WEEK) + " " + (cal2.get(Calendar.MONTH)+1) + " " + cal2.get(Calendar.DATE) + " " +
                cal2.get(Calendar.HOUR_OF_DAY) + ":" + cal2.get(Calendar.MINUTE) + ":" + cal2.get(Calendar.SECOND) + " " + cal2.get(Calendar.YEAR));

        }
}
