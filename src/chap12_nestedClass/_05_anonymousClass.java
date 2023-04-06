package chap12_nestedClass;

import chap12_nestedClass.clazz.Carc;

public class _05_anonymousClass {
    public static void main(String[] args) {
        //익명 중첩클래스 선언과 Calc인터페이스의 구현
        //익명중첩클래스는 추상클래스나 인터페이스를 구현한 클래스 없이 사용할 수 있다.
        Carc cal = new Carc() {
            @Override
            public void calculator(int a, int b) {
                System.out.println("결과는: " + (a+b));
            }
        };
        cal.calculator(10,20);
    }
}
