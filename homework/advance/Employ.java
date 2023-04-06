package advance;

public abstract class Employ {
    public int num;
    public String name;
    public int pay;

    public Employ(){
    }

    public Employ(int num, String name, int pay) {
        super();
        this.num = num;
        this.name = name;
        this.pay = pay;
    }

    public abstract double getMonthPay(int pay);

    public void showEmployeeInfo() {
        System.out.println();
    }
    public void print(){
        System.out.println(this.num);
        System.out.println(this.name);
        System.out.println(this.pay);
    }
}
