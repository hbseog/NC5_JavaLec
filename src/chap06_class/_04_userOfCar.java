package chap06_class;

import chap06_class.car.Car;

public class _04_userOfCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Car car2 = new Car();
		//매개변수가 1개인 생성자 호출
		Car car3 = new Car("기아");
		//매개변수가 1개인 생성자 호출
		Car car4 = new Car("기아","k9");
		
		car.setCompany("현대");
		car.setModel("제네시스");
		car.setColor("검정");
		car.setPrice(5000);
		car.carInfo();
		
		car2.company = "기아";
		car2.model = "k9";
		car2.color = "하얀색";
		car2.price = 4000;
		car2.carInfo();
	}

}
