package homework_0320;

public class ArrayUtility {
    static double[] intToDouble(int[] source){
        double[] a = {};
        for(int i : source){
            a[i] = (double)i;

        }
        return a;
    }
}
