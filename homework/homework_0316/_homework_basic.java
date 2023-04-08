package homework_0316;

public class _homework_basic {

	public static void main(String[] args) {
		/*
		int[] arr = new int[10];
		int num = 0, result=arr.length-1;
		while(result>=0) {
			num++;
			if(num%3==0) {
				arr[result] = num;
				System.out.print(arr[result]+" ");
				result--;
				}			
		}
		*/
		/*
		int[] num = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print("숫자 입력: ");
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println("합: " + sum);
		for(int i : num) {
			System.out.print(i + " ");
		}*/
		/*
		int[] num = new int[10];
		for(int i=0; i<num.length; i++) {
			Random rand = new Random();
			num[i] = rand.nextInt(9)+1;
		}
		for(int i : num) {
			if(i%2!=0)
				System.out.println(i + " ");
		}
		*/
		/*
		int[] num = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print("숫자 입력: ");
			num[i] = sc.nextInt();
		}
		for(int i : num) {
			if(i%2==0 || i%3==0)
				System.out.println(i + " ");
		}
		*/
	}

}
