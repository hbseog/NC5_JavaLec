package chap15_userfulClass;

import java.math.BigInteger;

public class _16_bigInteger02 {
    public static void main(String[] args) throws InterruptedException {
        for (int i=1; i<10; i++){
            System.out.println(i+"! = " + factorial(BigInteger.valueOf(i)));

        }
//        System.out.println(factorial(BigInteger.valueOf(10)));
    }

    static BigInteger factorial(BigInteger n){
        if(n.intValue() == 0){
            return BigInteger.ONE;
        }else {
            //재귀함수: 메소드 안에서 해당 메소드를 다시 호출
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

}
