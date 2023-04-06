package chap20_lambda.clazz;

public class Academy {
    private String subject;
    private int stuCnt, lecTime;
    public Academy(){}

    public Academy(String subject){
        this.subject = subject;
    }
    public Academy(String subject, int stuCnt) {
        this.subject = subject;
        this.stuCnt = stuCnt;
    }
    public Academy(String subject, int stuCnt, int lecTime) {
        this.subject = subject;
        this.stuCnt = stuCnt;
        this.lecTime = lecTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getStuCnt() {
        return stuCnt;
    }

    public void setStuCnt(int stuCnt) {
        this.stuCnt = stuCnt;
    }

    public int getLecTime() {
        return lecTime;
    }

    public void setLecTime(int lecTime) {
        this.lecTime = lecTime;
    }

    public void lectureInfo(){
        System.out.println("과목: " + this.subject);
        System.out.println("수강생: " + this.stuCnt);
        System.out.println("강의시간: " + this.lecTime);
    }
}
