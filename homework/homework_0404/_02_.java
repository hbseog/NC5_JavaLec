package homework_0404;

import java.util.Scanner;

public class _02_ {
    public static void main(String[] args) {
        _02_enum[] en = _02_enum.values();
        int normal=0, option=0, total=0;
        Scanner sc = new Scanner(System.in);
        for(_02_enum i : en){
            System.out.print("일반 " + i.getName()+" 개수 입력: ");
            normal = sc.nextInt();
            sc.nextLine();
            System.out.print("옵션 " + i.getName()+" 개수 입력: ");
            option = sc.nextInt();
            sc.nextLine();
            total += i.totalPrice(normal,option);
            normal=0; option=0;
        }
        System.out.print("총 가격은: " + total + "원 입니다.");
    }
}
