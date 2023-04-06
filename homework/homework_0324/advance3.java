package homework_0324;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class advance3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 날짜입력(yyyy-MM-dd): ");
        String str = sc.nextLine();
        String[] strArr = str.split("-");
        Calendar cal1 = Calendar.getInstance();
        cal1.set(parseInt(strArr[0]),parseInt(strArr[1]),parseInt(strArr[2]));
        System.out.print("두 번째 날짜입력(yyyy-MM-dd): ");
        String str2 = sc.nextLine();
        String[] strArr2 = str2.split("-");
        Calendar cal2 = Calendar.getInstance();
        cal2.set(parseInt(strArr2[0]),parseInt(strArr2[1]),parseInt(strArr2[2]));

        long diff = cal2.getTimeInMillis() - cal1.getTimeInMillis();
        int day = (int)diff/1000/60/60/24;
        System.out.println(cal1.get(Calendar.YEAR)+"-"+cal1.get(Calendar.MONTH)+"-"+cal1.get(Calendar.DATE));
        for (int i=0;i<day;i++) {
            cal1.add(Calendar.DATE,1);
            System.out.println(
                    cal1.get(Calendar.YEAR) + "-" +
                            cal1.get(Calendar.MONTH) + "-" +
                            (cal1.get(Calendar.DATE)));
        }
    }
}
