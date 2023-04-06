package chap20_lambda;

import chap20_lambda.clazz.FourOpCalc;

import java.util.Scanner;

public class _10_lambdaEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("정수를 입력하세요.");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("연산자 입력");
        char operator = sc.nextLine().charAt(0);

        FourOpCalc foc = new FourOpCalc();
        int result = foc.calc(num1,num2,operator,(a,b)->{
            int returnNum = 0;
            switch (operator){
                case '+':
                    returnNum = num1+num2;
                    break;
                case '-':
                    returnNum = num1-num2;
                    break;
                case '*':
                    returnNum = num1*num2;
                    break;
                case '/':
                    returnNum = num1/num2;
                    break;
                default:
                    returnNum = -999;
                    break;
            }
            return returnNum;
        });
        System.out.println(result);
    }
}
