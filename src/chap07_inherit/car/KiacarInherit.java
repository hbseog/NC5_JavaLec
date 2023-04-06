package chap07_inherit.car;

public class KiacarInherit extends Car{
	public String company, model, color;
	public int pirce;

	
	public void speedUp() {
		System.out.println("엑셀을 밟는다.");
	}
	public void speedDown() {
		System.out.println("브레이크를 밟는다.");
	}
	public void aa() {
		System.out.println("테스트");
	}
}
