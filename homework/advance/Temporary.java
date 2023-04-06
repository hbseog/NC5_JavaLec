package advance;

public class Temporary extends Employ {
    public int hireYear;

    public Temporary(){
    }

    public Temporary(int num, String name, int pay, int bonus){
        super(num, name, pay);
        this.hireYear =bonus;
    }

    @Override
    public double getMonthPay(int pay) {
        double m_pay = pay/12;
        return m_pay;
    }

}