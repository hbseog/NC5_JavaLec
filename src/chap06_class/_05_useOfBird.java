package chap06_class;

import chap06_class.animal.Bird;

public class _05_useOfBird {

	public static void main(String[] args) {
		Bird bird = new Bird("참새", "모이");
		Bird eagle = new Bird("독수리","뱀");
		Bird dakdulgi = new Bird("닭둘기","잡식");
		bird.eat();
		eagle.eat();
		dakdulgi.eat();
		/*
		bird.setWing(2);
		bird.setColor("black");
		bird.setFood("고기");
		bird.setSize(30);
		bird.setName("독수리");
		
		bird.fly();
		bird.eat();
		bird.walk();
		*/
	}

}
