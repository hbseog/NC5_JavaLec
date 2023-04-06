package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;

public class _02_polymorphism {
    public static void main(String[] args) {
        //1. 다형성을 사용하지 않고 많은 Tv바꾸기
        LgTv lgtv = new LgTv();
        SamsungTv stv = new SamsungTv();
        stv.powerOn();
        lgtv.powerOn();
        lgtv.operate(13);
        lgtv.powerOff();


    }
}
