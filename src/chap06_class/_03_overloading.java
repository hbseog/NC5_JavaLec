package chap06_class;

import chap06_class.calc.Multiple;

public class _03_overloading {

	public static void main(String[] args) {
		Multiple mul = new Multiple();
		mul.setNum1(4);
		mul.setNum2(3);
		System.out.println("매개변수가 없는 Mul메소드");
		System.out.println(mul.Mul());
		System.out.println("매개변수가 1개인 Mul메소드");
		System.out.println(mul.Mul(4));
		System.out.println("매개변수가 2개인 Mul메소드");
		System.out.println(mul.Mul(4,3));
	}

}
