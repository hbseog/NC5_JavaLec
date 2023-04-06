package chap10_abstraction.product;

public class SamsungTv extends Tv {
    public void powerOn(){
        System.out.println("7SAMSUNG 켬");
    }
    public void powerOff(){
        System.out.println("SAMSUNG 끔");
    }
    public void operate(int channel){
        System.out.println("SAMSUNG" + channel + "로 이동");
        super.lastChannel = channel;
    }
}
