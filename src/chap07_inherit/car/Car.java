package chap07_inherit.car;

public class Car {
	public String company, model, color;
	public int pirce;
	
	public void carInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + pirce);
	}
	
	public void speedUp() {
		System.out.println("속도를 올린다.");
	}
	public void speedDown() {
		System.out.println("속도를 줄인다.");
	}
}
