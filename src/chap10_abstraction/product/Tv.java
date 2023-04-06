package chap10_abstraction.product;

abstract public class Tv {
    
    public int lastChannel=1;
    public abstract void powerOn();
    //선언부만 정의하고 구현부는 자식클래스에 의해 정의 => 추상메소드
    
    public abstract void powerOff();
    public abstract void operate(int channel);
    public void moveTo(int channel) {
        System.out.println(channel + "로 이동합니다.");
    }
    public void channelUp(){
        lastChannel++;
    }
    public void channelDown(){
        lastChannel--;
    }
}
