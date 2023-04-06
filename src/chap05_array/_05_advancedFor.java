package chap05_array;

public class _05_advancedFor {

	public static void main(String[] args) {
		int[] score = {100, 84, 92, 65, 71};
		int sum=0;
		double avg;
		for(int a : score) {
			System.out.println(a);
			sum += a;
		}
		avg = sum/(double)score.length;
		System.out.println(sum + ", " + avg);
		
	}

}
