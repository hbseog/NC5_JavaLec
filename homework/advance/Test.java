package advance;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, pay, bonus, hireYear, workDay, i=0;
        String name;
        Employ[] aa = new FullTime[10];
        while (true) {
            System.out.println("직원 관리 프로그램");
            System.out.println("*** 메뉴 선택 ***");
            System.out.println("1. 정규직 저장");
            System.out.println("2. 임시직 저장");
            System.out.println("3. 계약직 저장");
            System.out.println("4. 전체 정보 출력");
            System.out.println("5. 월급 계산 출력");
            System.out.println("6. 프로그램 종료");
            System.out.print("\n원하는 메뉴 번호를 선택하세요 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("사번을 입력하세요 : ");
                    num = sc.nextInt();
                    System.out.print("이름을 입력하세요 : ");
                    name = sc.next();
                    sc.nextLine();
                    System.out.print("급여를 입력하세요 : ");
                    pay = sc.nextInt();
                    System.out.print("보너스를 입력하세요 : ");
                    bonus = sc.nextInt();
                    Employ ft = new FullTime(num, name, pay, bonus);
                    aa[i] = ft;
                    break;
                case 2:
                    System.out.print("사번을 입력하세요 : ");
                    num = sc.nextInt();
                    System.out.print("이름을 입력하세요 : ");
                    name = sc.next();
                    sc.nextLine();
                    System.out.print("급여를 입력하세요 : ");
                    pay = sc.nextInt();
                    System.out.print("보너스를 입력하세요 : ");
                    hireYear = sc.nextInt();
                    Employ tm = new Temporary(num, name, pay, hireYear);
                    break;
                case 3:
                    System.out.print("사번을 입력하세요 : ");
                    num = sc.nextInt();
                    System.out.print("이름을 입력하세요 : ");
                    name = sc.next();
                    sc.nextLine();
                    System.out.print("급여를 입력하세요 : ");
                    pay = sc.nextInt();
                    System.out.print("보너스를 입력하세요 : ");
                    workDay = sc.nextInt();
                    Employ ct = new Contract(num, name, pay, workDay);
                    break;
                case 4:
                    aa[i].print();
                default:
                    break;
            }
        }
        /*
        Employ e = new FullTime(1, "홍길동", 7000, 5000);
        System.out.println(e.num);
        System.out.println(e.name);
        System.out.println(e.getMonthPay(e.pay));
        e.showEmployeeInfo();*/
    }
}