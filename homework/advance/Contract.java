package advance;

public class Contract extends Employ {
    public int workDay;

    public Contract(int num, String name, int pay, int bonus){
        super(num, name, pay);
        this.workDay =bonus;
    }

    @Override
    public double getMonthPay(int pay) {
        double m_pay = pay*workDay;
        return m_pay;
    }
}