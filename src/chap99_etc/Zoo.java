package chap99_etc;

class ZooKeeper{
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
}
class Animal{
	String name;
	void setName(String name) {
		this.name = name;
	}
}
class Lion extends Animal implements Predator{
	public String getFood() {
		return "lionfood";
	}
}
class Tiger extends Animal implements Predator{
	public String getFood() {
		return "tigerfood";
	}
}
public class Zoo {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		zooKeeper.feed(lion);
		zooKeeper.feed(tiger);
	}
}
