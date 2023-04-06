package homework_0324;

import java.util.Calendar;
import java.util.Scanner;

public class advance1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int y,m,d;
        System.out.print("년 입력: ");
        y = sc.nextInt();
        sc.nextLine();
        System.out.print("월 입력: ");
        m = sc.nextInt()-1;
        sc.nextLine();
        System.out.print("일 입력: ");
        d = sc.nextInt();
        sc.nextLine();

        cal.set(y, m, d);
        int date=0;
        for (int i=cal.get(Calendar.YEAR);i<=2022;i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                date++;
            }
        }
        System.out.println("2022년 결혼 기념일은 "+(cal.get(Calendar.YEAR)+20)+"년 "+(cal.get(Calendar.MONTH)+1) + "월 "+(cal.get(Calendar.DATE)+date)+"일 입니다.");
    }
}