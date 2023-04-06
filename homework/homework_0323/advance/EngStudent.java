package homework_0323.advance;

public class EngStudent extends CommonStat implements Student{
    public EngStudent(int sno, String name, String subject, int finalExam) {
        super(sno, name, subject, finalExam);
    }

    @Override
    public void printinfo() {

    }

    @Override
    public double getAvg() {
        return 0;
    }
}
