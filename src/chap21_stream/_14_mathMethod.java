package chap21_stream;

import java.util.Arrays;

public class _14_mathMethod {
    public static void main(String[] args) {
        int[] intArr={1,2,3,4,5,6,7,8,9,10};
        long cnt = Arrays.stream(intArr).count();
        System.out.println("요소의 개수는: "+cnt);

        int first = Arrays.stream(intArr).findFirst().getAsInt();
        System.out.println("첫 번째 요소는" + first);

        int max = Arrays.stream(intArr).max().getAsInt();
        int min = Arrays.stream(intArr).min().getAsInt();
//        /합계와평균
        int sum = Arrays.stream(intArr).sum();
        double avg = Arrays.stream(intArr).average().getAsDouble();
        System.out.println("합계는: " + sum + "평균은"+avg);
    }
}
