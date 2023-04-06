package chap20_lambda.clazz;

public class FourOpCalc {
    private int a,b;
    private char operator;
    public int calc(int a, int b, char c, FourOperator fo){
        int result = fo.op(a,b);
        return result;
    }
//    public int calc(int a, int b, char op, FourOperator fo){
//        int result = fo.op
//    }
}