package chap12_nestedClass;

import chap12_nestedClass.clazz.NestedClass;


public class _02_InstanceOfNestedClass {
    public void main(String[] args) {
        //인스턴스클래스 객체생성
        NestedClass nc = new NestedClass();

        //1.정적중첩클래스의 객체생성
        NestedClass.Mul mul = nc.new Mul();

        //2. 정적중첩 클래스의 객체생선\성
        NestedClass.Div div = new NestedClass.Div();

        //중첩클래스의 객체생성은 외부클래스의 객체를 사용해서 외부클래스의 객체.new 중첩클래스 생성자()
        
        //3-1 정적중첩클래스의 정적멤버에 접근
        System.out.println(NestedClass.Div.result);
        
        //static으로 선언된 정적 중첩클래스의 객체는 외부 클래스의 객체없이도 생성가능


        //3-2 정적 중첩 클래스의 일반 멤버에 접근
        System.out.println(div.getNum3());

        //4. 인스턴스 중첩 클래스의 객체사용
        mul.setNum1(2);
        mul.setNum2(4);
        System.out.println(mul.getResult());
    }
}
