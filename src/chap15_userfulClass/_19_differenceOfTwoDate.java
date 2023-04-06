package chap15_userfulClass;

import java.util.Calendar;

public class _19_differenceOfTwoDate {
    public static void main(String[] args) {
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();

        d2.set(2011, 2, 11);
        //getTimeInMilli(): long타입으로 지정된 날짜를 밀리세컨드로 리턴.
        long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
//        System.out.println("d2부터 d1까지" + diff/1000 + "초가 지났습니다.");
//        System.out.println("d2부터 d1까지" + diff/1000/60 + "분이 지났습니다.");
//        System.out.println("d2부터 d1까지" + diff/1000/60/60 + "시간이 지났습니다.");
//        System.out.println("d2부터 d1까지" + diff/1000/60/60/24 + "일이 지났습니다.");
//        System.out.println("d2부터 d1까지" + diff/1000/60/60/24/7 + "주가 지났습니다.");
//        System.out.println("d2부터 d1까지" + diff/1000/60/60/24/30 + "달이 지났습니다.");
//        System.out.println("d2부터 d1까지" + diff/1000/60/60/24/30/12 + "년이 지났습니다.");
        toString(diff);
    }

    static void toString(long a) {
        long y, mo, d, h, mi, s, l;
        y = a / (1000 * 60 * 60 * 24 * 30 * 12);
        l = a % (1000 * 60 * 60 * 24 * 30 * 12);
        mo = l / (1000 * 60 * 60 * 24 * 30);
        l=mo%(1000 * 60 * 60 * 24 * 30);
        d = l / (1000 * 60 * 60 * 24);
        l=l%(1000 * 60 * 60 * 24);
        s = l / (1000 * 60 * 60);
        l=l%(1000 * 60 * 60);
        mi = l / (1000 * 60);
        l=l%(1000 * 60);
        h = l / 60;


        System.out.println("d2부터 d1까지" + y + "년 " + mo + "달 " + d + "일 " + h + "시간 " + mi + "분 " + s + "초 지났습니다.");

    }

}