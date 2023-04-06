package chap09_polymorphism.product;

public class SamsungTv extends Tv{
    public void powerOn(){
        System.out.println("제조사 SAMSUNG");
        super.powerOn();
    }
    public void pwerOff(){
        super.powerOff();
        System.out.println("제조사 SAMSUNG");
    }
    public void operate(int channel){
        super.operate(channel);
    }
}
