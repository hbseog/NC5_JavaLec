package chap07_inherit.car;

public class HyundaicarInherit extends Car{
	public String company, model, color;
	public int pirce;

	public void speedUp() {
		System.out.println("스피드 업");
	}
	public void speedDown() {
		System.out.println("스피드 다운");
	}
}
