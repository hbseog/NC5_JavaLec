package advance;

public class FullTime extends Employ {
    static public int bonus;
    static public int m_pay;


    public int getBonus() {
        return bonus;
    }

    public FullTime(int num, String name, int pay, int bonus){
        super(num, name, pay);
        this.bonus =bonus;
    }


    public void print(){
        System.out.println(this.num);
        System.out.println(this.name);
        System.out.println(this.pay);
        System.out.println(getMonthPay(pay));
    }


    @Override
    public double getMonthPay(int pay) {
        m_pay = (pay/12) + (bonus/12);
        return m_pay;
    }
}