package chap07_inherit;

import java.util.logging.Handler;

import chap07_inherit.car.Car;
import chap07_inherit.car.Hyundaicar;
import chap07_inherit.car.HyundaicarInherit;
import chap07_inherit.car.Kiacar;
import chap07_inherit.car.KiacarInherit;

public class _02_withInherit {
	public static void main(String[] args) {
		//1. 객체생성
		Car car = new Car();
		Kiacar kCar = new Kiacar();
		Hyundaicar hCar = new Hyundaicar();
		
	car.company = "GM";
	kCar.company = "Kia";
	hCar.company = "Hyundai";
	
	//자식클래스는 부모의 형태도 가지고 있기 때문에 부모클래스로 만들어진 변수에 대입 가능하다.
	Car car1 = new KiacarInherit();
	car1.company = "Kia";
	car1.carInfo();
	car1.speedUp();
	car1.speedDown();
	//car1.aa();
	
	car1 = new HyundaicarInherit();
	car1.company = "Hyundai";
	car1.carInfo();
	//다형성의 기초 => 같은 모양의 객체로 다른 값을 발현.
	car1.speedUp();
	car1.speedDown();
	}
}
