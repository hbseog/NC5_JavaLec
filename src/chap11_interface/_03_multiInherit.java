package chap11_interface;

import chap11_interface.Tv.ElectronicDevice;
import chap11_interface.Tv.LgTv;
import chap11_interface.Tv.Tv;

public class _03_multiInherit {
    public static void main(String[] args) {
        Tv tv = new LgTv();
        tv.powerOn();
        tv.powerOff();
        tv.Sound();
        tv.reset();

        ElectronicDevice.warn();
        //static메소드를 사용하려면 해당 메소드가 선언된 클래스를 사용해서 호출한다.
        //static메소드는 상속받은 자식클래스에서는 호출이 불가하다.
    }
}
