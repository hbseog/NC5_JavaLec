package chap15_userfulClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _24_simpleDateFormat {
    public static void main(String[] args) {
        Date toDay = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 MM월 dd일");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf1.format(toDay));
        System.out.println(sdf2.format(toDay));
    }
}
