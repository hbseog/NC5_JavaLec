package chap11_interface.Tv;

public interface ElectronicDevice {
    public void powerOn();
    public void powerOff();
    default void reset(){
        System.out.println("장치를 리셋합니다.");
    }
    public static void warn(){
        System.out.println("알람을 울리다.");
        //static메소드는 그대로 사용 가능
    }
}
