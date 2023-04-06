package chap10_abstraction.school;

public class ComputerSchool extends Schools{
    @Override
    public void teaching() {
        teacherCnt = 1;
        System.out.println("컴퓨터 선생님 " + teacherCnt + "명 수업중");
    }

    @Override//어노테이션 => override인 경우 자동으로 컴파일러에게 알려줘서 매번 비교를 하지 않고 바로 실행할 수 있음
    public void homework() {
        subject = "computer";
        System.out.println(subject + " 숙제중");
    }

    @Override
    public void rest() {
        classCnt = 1;
        System.out.println(classCnt + "반 쉬는 중");
    }

    @Override
    public void check() {
        studentCnt = 10;
        System.out.println(studentCnt + "명 출석");
    }
}
