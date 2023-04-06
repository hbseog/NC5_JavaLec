package homework_0315;

public class _homework_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 10 ~ 1까지 거꾸로 while문으로 출력
//		2. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
//		3. 10 ~ 1까지 거꾸로 for문으로 출력
//		4. 1 ~ 100까지 합을 while문으로 출력
//		5. 1 ~ 100까지 합을 do ~ while문으로 출력
//		6. 1 ~ 100까지 합을 for문으로 출력
		
		
		/*1.
		int num=10;
		while(num!=0) {
			System.out.println(num);
			num--;
		}
		*/
		
		
		/*2.
		int num=10;
		do {
			System.out.println(num);
			num--;
		}while(num!=0);
		*/
		
		
		/*3.
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		*/
		
		
		//4
		/*
		int sum=0, num=0;
		while(num<100) {
			//num++;
			sum += ++num;
		}
		System.out.println(sum);
		*/
		
		/*5
		int sum=0, num=0;
		do{
			num++;
			sum += num;
		}while(num<100);
		System.out.println(sum);
		*/
		
		/*
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		*/
	}

}
