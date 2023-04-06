package homework_0323.advance;

import java.util.Scanner;

public class advance {
    static ComStudent stu = new ComStudent();
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("------학적관리------\n" +
                "1. 학생정보 입력\n" +
                "2. 학생정보 검색\n" +
                "3. 학생정보 전체출력\n" +
                "4. 학과별 성적 순위\n" +
                "5. 종료");
        int chose = sc.nextInt();
        sc.nextLine();

            switch (chose){
                case 1:
                    studentInfo();
                    break;
                case 2:
                    System.out.print("학번 입력: ");
                    int aa = sc.nextInt();
                    sc.nextLine();
                    stu.printinfo();
                    search(aa);

                    int c = sc.nextInt();
                    sc.nextLine();
                    System.out.println("학번은 입력됨");
            }
        }



    }
    public static void studentInfo() {
        Scanner sc = new Scanner(System.in);
        int a;

        String sub = null;
        int sno=0;
        int cnt1 = 0, cnt2 = 0;
        String name="";
        String subject="";
        int finalExam=0;
        while (true) {
            System.out.println("------학생정보 입력------\n" +
                    "1. 기본정보 입력\n" +
                    "2. 과목정보 입력\n" +
                    "3. 뒤로가기");
            a = sc.nextInt();
            sc.nextLine();
            if (a == 1) {
                System.out.print("학번: ");
                sno = sc.nextInt();
                sc.nextLine();
                System.out.print("이름: ");
                name = sc.nextLine();
                System.out.print("학과(컴공, 영어, 수학): ");
                sub = sc.nextLine();
                if (sub == "컴공") {
                   // stu[cnt].getinfo(subject, finalExam);
                }
                cnt1++;
            } else if (a == 2 && cnt1 != cnt) {
                System.out.print("과목을 입력하세요: ");
                subject = sc.nextLine();
                System.out.print("점수를 입력하세요: ");
                finalExam = sc.nextInt();
                if (sub.equals("컴공")) {
                    stu = new ComStudent(sno, name,subject,finalExam);
                    System.out.println(stu.sno);
                    //stu[cnt].getinfo2(sno,name);
                }
            }
            else if(a==3){
                System.out.println("뒤로가기\n");
                System.out.println("학번"+stu.sno);
                break;
            }
            else{
                System.out.println("다시입력하세요");
                continue;
            }
        }
    }
    public static void search(int a){
        System.out.println(cnt);
        for(int i = 0;i<1;i++){
            System.out.println("포문");
            if(stu.sno==a){
                System.out.println("이프문");
                stu.printinfo();
            }
        }
    }
}
