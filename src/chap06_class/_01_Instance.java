package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Divide;
import chap06_class.calc.Minus;
import chap06_class.calc.Multiple;

public class _01_Instance {

	public static void main(String[] args) {
		//객체화(인스턴스화: 생성자를 통해서 객체를 생성하고 heap메모리 영역 저장 + 항상 new 키워드와 함께 사용)
		Add add = new Add();
		Multiple multiple = new Multiple();
		Minus minus = new Minus();
		Divide divide = new Divide();
		Calc calc = new Calc();
		add.setNum1(20);
		add.setNum2(10);
		add.setResult(add.getNum1() + add.getNum2());
		System.out.println(add.add());
		minus.setNum1(20);
		minus.setNum2(10);
		minus.setResult(minus.getNum1() - minus.getNum2());
		System.out.println(minus.Min());
		multiple.setNum1(20);
		multiple.setNum2(10);
		multiple.setResult(multiple.getNum1() * multiple.getNum2());
		System.out.println(multiple.Mul());
		divide.setNum1(20);
		divide.setNum2(10);
		divide.setResult(divide.getNum1() / divide.getNum2());
		System.out.println(divide.Div());
		
		System.out.println(calc.minus(calc.add(10, 20), calc.divide(10, 5)));

		Calc cal2 = new Add();
		System.out.println(cal2.add(4, 3));
		
		Calc cal3 = new Minus();
		System.out.println(cal3.minus(4, 3));
		
	}
}
