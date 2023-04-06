package study.clazz;

import java.util.Scanner;

public class clazz_1 {
    Scanner sc = new Scanner(System.in);
    //1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
    String studentName, studentNum, studentClass;

    public void inputStudentInfo() {
        System.out.print("학생 이름 입력: ");
        this.studentName = sc.nextLine();
        System.out.print("학생 학번 입력: ");
        this.studentNum = sc.nextLine();
        System.out.print("학생 학과 입력: ");
        this.studentClass = sc.nextLine();
    }
    public void printStudentInfo(){
        System.out.println("이름: "+this.studentName);
        System.out.println("학번: "+this.studentNum);
        System.out.println("학과: "+this.studentClass);
    }
}
