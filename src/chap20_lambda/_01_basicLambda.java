package chap20_lambda;

import chap20_lambda.clazz.Calculator;

public class _01_basicLambda {
    public static void main(String[] args) {
        //함수형 인터페이스는 추상메소드 하나만 가질 수 있기 떄문에 매개변수를 람다식을 이용해 메소드 코드블록처럼 전송하게 되면
        //함수형 인터페이스에서 추상메소드의 구현부 인식
        //함수형 인터페이스는 action 메소드에서 호풀하게 되면 구현된 추상메소드를 사용할 수 있다.
        action((a,b) -> {
            int result = a+b;
            System.out.println(result);
        });
        action((a,b) -> {
            int result = a-b;
            System.out.println(result);
        });
    }
    public static void action(Calculator calc){
        int a=10;
        int b=4;
        calc.calculator(a,b);
    }
}
