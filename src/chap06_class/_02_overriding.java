package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Minus;

public class _02_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cal = new Calc();
		Add add = new Add();
		Minus minus = new Minus();
		
		System.out.println(cal.add(4,3));
		System.out.println(cal.minus(4, 3));
		System.out.println("----------------");
		System.out.println(add.add(4,3));
		System.out.println(minus.minus(4, 3));
	}

}
