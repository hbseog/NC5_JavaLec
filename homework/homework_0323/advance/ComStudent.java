package homework_0323.advance;
public class ComStudent extends CommonStat implements Student{

    public ComStudent(int sno, String name, String subject, int finalExam) {
        super(sno, name, subject, finalExam);
    }
    public ComStudent(){};
    public void getinfo(String subject, int finalExam) {
        this.subject[cntt] = subject;
        this.finalExam[cntt] = finalExam;
        cntt++;
    }
    public void getinfo2(int sno, String name){
        this.sno = sno;
        this.name.append(name);
    }
    @Override
    public void printinfo() {
        System.out.println("학번: "+sno);
        System.out.println("이름: "+name);
        System.out.println("학과: 컴공과");
        System.out.println("평균 점수: "+exam());
    }

    @Override
    public double getAvg() {
        return exam();
    }
}
