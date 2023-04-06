package chap14_exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _03_throws {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            //throws로 예외처리된 메소드를 호출할 때는 예외가 발생할 수 있는 확률이 있기 때문에
            //try~catch로 묶어서 처리한다.
            //메소드 throws하는 exceptiondl chexked면 무조건 예외처리 예외처리 안하면 에러발생
            //unchecked면 예외처리 안 해도 된다.
            //getException(arr);
            method();
//            System.out.println();
//            div(10,0);
        }catch (Exception e){
            if(e.getMessage() != null)
            System.out.println(e.getMessage());
           else  e.printStackTrace();
        }

    }
    public static void getException(int[] intArr) throws Exception{
        for(int i=0; i<10; i++){
            System.out.println(intArr[i]);
        }
    }
    public static int div(int a, int b)throws ArithmeticException{
        return a/b;
    }
    public static void method() throws InputMismatchException, IOException, ArithmeticException, IndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
    }
}
