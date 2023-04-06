package chap99_etc;

public class _03_mathRandom {

	public static void main(String[] args) {
		//1. 난수발생 첫 번째 방식
		//Math.random() 사용
		// 0<= Math.random <1 사이의 난수
//		System.out.println(Math.random());
		
		//2. 1 <= 난수 < 11
		//0 <= rand * 10 < 10
		//1 <= (int)(rnad * 10) + 1 < 11
		int rand = (int)(Math.random() * 10) + 1;
		System.out.println(rand);
		
		//3. 1~45까지 난수 발생기
		int randNum = (int)(Math.random()* 45)+1;

		
		System.out.println(randNum);
		
		//4. 200~299까지 난수 발생기
		int randNum2 = (int)(Math.random() * 100)+200;
		System.out.println(randNum2);
		
		//a~b가지 랜덤 (int) (math.random() * (b - a + 1)) + a;
	}

}
