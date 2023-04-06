package study;

abstract class player{
	int score;
	abstract void audio();
	abstract int tv();
	abstract int game(int score);
}

class play extends player{
	void audio() {
		System.out.println("Audio Play");
	}
	int tv() {
		return 100;
	}
	int game(int score) {
		this.score = score;
		return score;
	}
}

public class qweqewe {
 public static void main(String[] args) {
	 player play = new play();
	 System.out.println(play.game(10));
	 System.out.println(play.tv());
	 play.audio();
	}
}