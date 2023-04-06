package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;
import chap09_polymorphism.product.Tv;

public class _03_polymorphism {
    public static void main(String[] args) {
        //1. 다형성을 이용해 Tv 바꾸기
        //다형성을 이용하여 코드 내용을 많이 줄일 수 있다.
        Tv tv = new LgTv();

        tv.powerOn();
        tv.powerOff();
        tv.moveTo(11);

        tv = new SamsungTv();
        tv.powerOn();
        tv.powerOff();
        tv.operate(11);


                //{company: ["현대", "기아" ...])
        System.out.println(tv.toString());
    }
}
