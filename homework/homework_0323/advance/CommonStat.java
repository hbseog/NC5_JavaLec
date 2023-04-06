package homework_0323.advance;

public class CommonStat{
    public int sno;
    public StringBuffer name = new StringBuffer();
    public String[] subject = new String[10];
    public int[] finalExam = new int[10];

    public int cntt=0;



    public CommonStat(int sno, String name, String subject, int finalExam) {
        this.subject[cntt] = subject;
        this.finalExam[cntt] = finalExam;
        cntt++;
        this.sno = sno;
        this.name.append(name);
        System.out.println("학번: "+this.sno);
        System.out.println("이름: "+this.name);
        System.out.println("학과: 컴공과");
        System.out.println("평균 점수: "+this.exam());
    }

    public CommonStat() {

    }

    public CommonStat(String subject, int finalExam) {

    }


    public double exam(){
        int sum=0;
        for(int i : finalExam){
            sum+=i;
        }
        return sum/cntt;
    }

    public void printinfo() {
        System.out.println("시발");
    }
}
