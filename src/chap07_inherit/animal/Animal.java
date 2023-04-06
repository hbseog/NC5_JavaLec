package chap07_inherit.animal;

public class Animal {
	public int age, size, legCnt;
	public boolean haswing;
	
	public void Animal() {
	}
	
	
	public Animal(int age, int size, int legCnt, boolean haswing) {
		super();
		this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.haswing = haswing;
	}



	public void eat() {
		System.out.println("식사를 한다.");
		
	}
}
