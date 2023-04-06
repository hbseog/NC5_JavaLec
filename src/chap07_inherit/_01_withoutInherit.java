package chap07_inherit;

import java.util.logging.Handler;

import chap07_inherit.car.Car;
import chap07_inherit.car.Hyundaicar;
import chap07_inherit.car.Kiacar;

public class _01_withoutInherit {
	public static void main(String[] args) {
		//1. 객체생성
		Car car = new Car();
		Kiacar kCar = new Kiacar();
		Hyundaicar hCar = new Hyundaicar();
		
	car.company = "GM";
	kCar.company = "Kia";
	hCar.company = "Hyundai";
	}
}
