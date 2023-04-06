package chap13_objectArray.clazz;

public class English implements ILecture{
    int subjectCnt, lectureTime;

    public English(int subjectCnt, int lectureTime) {
        this.subjectCnt = subjectCnt;
        this.lectureTime = lectureTime;
    }

    @Override
    public void proceedLecture(int subjectCnt, int lectureTime) {
        System.out.println("영어수업을 " + subjectCnt + "명의 학생이 듣습니다.\n 수업 시간은 " + lectureTime + "분입니다.");
    }
    public English(){}
}
