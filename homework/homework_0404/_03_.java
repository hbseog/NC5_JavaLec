package homework_0404;

import java.util.Scanner;

public class _03_ {
    public static void main(String[] args) {
        _03_enum[] en = _03_enum.values();
        int sum=0;
        System.out.print("년도를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <5; i++) {
            sum += en[i].sumDays(year);
        }
        System.out.print("합계: " + sum);
        sc.close();
    }
}
