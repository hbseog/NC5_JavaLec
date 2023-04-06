package advance;

import java.util.Calendar;

public class    _03_advance01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calendar cal = Calendar.getInstance();

        cal.set(2001, 11, 19);

        int year = (cal.get(Calendar.YEAR) - 1);

        for (int i = year; i <= 2022; i++) {
            if (isLeap(i)) {
                System.out.println(i + "년도는 윤년입니다.");
                cal.roll(Calendar.DATE, 1);
            } else {
                System.out.println(i + "년도는 윤년이 아닙니다.");
            }
        }
        System.out.println("2022년도 결혼기념일 : "
                +(cal.get(Calendar.MONTH)+1)
                +"월 "+cal.get(Calendar.DATE)+"일");
    }

    public static boolean isLeap(int year) {
        if ((year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else
            return false;

    }
}
