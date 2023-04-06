package chap06_class.animal;

public class Bird {
	public Bird(String name) {
		this.name = name;
	}
	public Bird(String name, String food) {
		this.name = name;
		this.food = food;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	//날개(int wing), 
	//색깔(Srting color),
	//새이름(String name),
	//크기(int size),
	//식습관(String food)

	//날다(void fly),
	//독수리(name)는 날개를 이용하여 하늘을 납니다.
	//운다(void cry),
	//독수리는 나무에 앉아 웁니다.
	//걷는다(void walk),
	//독수리는 땅을 걷는다
	//먹이를 먹는다(void eat)
	//독수리는 고기(food)를 먹는다.
	private int wing, size;
	private String color, name, food;
	
	
	public int getWing() {
		return wing;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public void fly(int name) {
		System.out.println(name + "은(는) 날개 " + wing +"개를 이용하여 하늘을 납니다.");
	}
	public void walk(int name) {
		System.out.println(name + "은(는) 나무에 앉아 웁니다.");
	}
	public void eat(int name, String food) {
		System.out.println(name + "은(는) " + food + "를 먹는다.");
	}
	
	public void fly() {
		System.out.println(name + "은(는) 날개를" + wing +"개를 이용하여 하늘을 납니다.");
	}
	public void walk() {
		System.out.println(name + "은(는) 나무에 앉아 웁니다.");
	}
	public void eat() {
		System.out.println(name + "은(는) " + food + "를 먹는다.");
	}
}
