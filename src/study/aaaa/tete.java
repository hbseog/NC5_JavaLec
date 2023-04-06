package study.aaaa;

import java.math.BigInteger;
import java.util.Scanner;

public class tete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[] n = new int[t];
        int[] m = new int[t];
        for (int i = 0; i < t; i++) {
            n[i] = sc.nextInt();
            sc.nextLine();
            m[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i<t; i++){
            BigInteger a = factorial(BigInteger.valueOf(n[i]));
            BigInteger b = factorial(BigInteger.valueOf(m[i]));
            BigInteger c = factorial(BigInteger.valueOf(m[i]- n[i]));
            if (n[i]==m[i]) System.out.println("왼쪽 사이트: " + n[i] + " /오른쪽 사이트: " + m[i] + "경우의 수: 1");
            else System.out.println("왼쪽 사이트: " + n[i] + " /오른쪽 사이트: " + m[i] + "경우의 수: " + b.divide(c.multiply(a)));
        }
    }
    public static BigInteger factorial(BigInteger a){
        if (a.intValue() == 1) return BigInteger.ONE;
        else {
            return a.multiply(factorial(a.subtract(BigInteger.ONE)));}
    }
}
