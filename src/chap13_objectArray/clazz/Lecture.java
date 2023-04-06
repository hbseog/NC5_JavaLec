package chap13_objectArray.clazz;

public class Lecture {
    public String subject;
    public int subjectCnt, lectureTime;

    public Lecture(String subject, int subjectCnt, int lectureTime) {
        this.subject = subject;
        this.subjectCnt = subjectCnt;
        this.lectureTime = lectureTime;
    }
    public void proceedLecture(){
        System.out.println(subject + " 수업을 " + subjectCnt + "명의 학생이 듣습니다. 수업 시간은 " + lectureTime + "분입니다.");
    }
}
