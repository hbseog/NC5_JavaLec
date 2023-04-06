package chap10_abstraction.school;

public abstract class Schools {
    public int classCnt, studentCnt, teacherCnt;
    public String subject;

    public abstract void teaching();
    public abstract void homework();
    public abstract void rest();
    public abstract void check();
}
