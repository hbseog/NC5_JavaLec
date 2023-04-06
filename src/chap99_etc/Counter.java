package chap99_etc;

public class Counter {

	public static void main(String[] args) {
		Ccounter counte = new Ccounter();
		Updater update = new Updater();
		for(int i=0; i<10; i++) {
			System.out.println(update.update(counte));
		}
	}

}

class Ccounter{
	int c = 0;
}

class Updater{
	int update(Ccounter upCount) {
		return upCount.c++;
	}
}