package chap04_controlStatement;

public class _04_forStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100까지의 합
		int sum = 0, num = 0;
		int i=1, j=0;
		
		for(; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합: " + sum);
		System.out.println("for문 종료시 i의 값" + i);
		
		for(; j<1000; j++) {
			if(j % 13 == 0 && j % 23 == 0) {
				System.out.println(j);
				num += j;
				if(num > 500) break;
			}
		}
		System.out.println("합: " + num);
		System.out.println("for문 종료시 j의 값" + j);
	}

}
