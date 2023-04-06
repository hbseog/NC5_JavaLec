package chap10_abstraction.school;

public class EnglishSchool extends Schools{
    @Override
    public void teaching() {
        teacherCnt = 2;
        System.out.println("영어선생님 " + teacherCnt + "명 수업중");
    }

    @Override
    public void homework() {
        subject = "english";
        System.out.println(subject + " 숙제중");
    }

    @Override
    public void rest() {
        classCnt = 2;
        System.out.println(classCnt + "반 쉬는 중");
    }

    @Override
    public void check() {
        studentCnt = 20;
        System.out.println(studentCnt + "명 출석");
    }
}
