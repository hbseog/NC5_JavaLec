package chap07_inherit.animal;

public class Bear extends Animal{
	public String hunny;
	public boolean isSleep;
	public void Bear() {}
	public Bear(int age, int size, int legCnt, boolean haswing, String hunny, boolean isSleep) {
		super(age, size, legCnt, haswing);
		this.hunny = hunny;
		this.isSleep = isSleep;
	}

	public void eat() {
		System.out.println("곰이 " + hunny + "를 먹습니다.");
	}
}
