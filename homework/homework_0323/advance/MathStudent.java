package homework_0323.advance;

public class MathStudent extends CommonStat implements Student{
    public MathStudent(int sno, String name, String subject, int finalExam) {
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
