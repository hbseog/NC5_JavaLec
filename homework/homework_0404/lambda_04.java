package homework_0404;

public class lambda_04 {
    public static void main(String[] args) {
        action(IntArrUtils :: getMax);
        action(IntArrUtils :: getMin);
        action(IntArrUtils :: getMid);
    }
    public static void action(MaxMinMid mmm){
        int[] arr = {5,1,7,9,3};
        System.out.println(mmm.maxOrMinOrMid(arr));
    }
}
