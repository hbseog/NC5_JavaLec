package chap07_inherit.animal;

public class Tiger extends Animal{
	public String meat, color;
	public boolean isSwimming, hasPattern;
	public void Tiger() {}
	public Tiger(int age, int size, int legCnt, boolean haswing, String meat, String color) {
		super(age, size, legCnt, haswing);
		this.meat = meat;
		this.color = color;
		//부모속성 초기화
//		this.age = age;
//		this.size = size;
//		this.legCnt = legCnt;
//		this.haswing = haswing;
		
		//부모클래스에 생서자가 있다면 위의 방식보다는 부모클래스의 생성자를 호출하는 게 편하다.
		//부모클래스를 자식클래스에서 사용하는 방식[ super ] 클래스
		//super 자체는 부모클래스를 의미, 생성자들은 super(); 호출 + super.@@@로 호출 가능
	}	
}
