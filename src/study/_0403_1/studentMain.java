package study._0403_1;

import java.util.ArrayList;
import java.util.Scanner;

public class studentMain {
    public static void main(String[] args) {
        ArrayList<studuntInfo> st = new ArrayList<studuntInfo>();
        printInfo aa = new printInfo();
        Scanner sc = new Scanner(System.in);
        int chose;
        while (true) {
            System.out.println("메뉴를 고르세요");
            System.out.println("1. 학생정보 입력");
            System.out.println("2. 학생정보 검색");
            System.out.println("3. 학생정보 전체 출력");
            chose = sc.nextInt();
            sc.nextLine();
            switch (chose) {
                case 1:
                    st.add(aa.Input());
                    break;
                case 2:
                    System.out.println("번호 입력");
                    int a = sc.nextInt();
                    sc.nextLine();
                    //aa.pr();
                    st.get(a-1).pr();
                    break;
                case 3:
                    for(studuntInfo ii : st){
                        ii.pr();
                        System.out.println("-------------");
                    }
            }
        }
    }
}
