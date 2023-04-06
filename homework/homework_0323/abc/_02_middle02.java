package homework_0323.abc;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_middle02 { //factorial(BigInteger.valueOf(i))
    // re= rs + i
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        for(int i = 1; i<num; i++){
            System.out.println(factorial(BigInteger.valueOf(i)) + "+" + (i+1) + "=" + factorial(BigInteger.valueOf(i+1)));
        }
    }
    static BigInteger factorial(BigInteger n){
        if(n.intValue() != 0){
            return n.add(factorial(n.subtract(BigInteger.ONE))); // 2 + (2-1)
        }else
            return BigInteger.ZERO;
    }
}

