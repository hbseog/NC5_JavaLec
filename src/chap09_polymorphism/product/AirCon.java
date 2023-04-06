package chap09_polymorphism.product;

public class AirCon extends ElectronicDevice{
    public int lastTemperature = 24;
    public void powerOn(){
        System.out.println("에어컨 전원을 켭니다. 설정된 온도는: " + lastTemperature);
    }
    public void powerOff(){
        System.out.println("에어컨 전원을 끕니다. 마지막 설정 온도는: " + lastTemperature);
    }
    public void changeTemperture(int temperture){
        lastTemperature = temperture;
        System.out.println("현재 온도를 " + temperture+"로 설정합니다.");
    }
    public void operate(int temperature){
        changeTemperture(temperature);
    }
}
