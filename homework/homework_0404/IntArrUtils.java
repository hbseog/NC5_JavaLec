package homework_0404;

import java.util.Arrays;

public class IntArrUtils {

    public static int getMax(int[] a){
        Arrays.sort(a);
        return a[a.length-1];
    }
    public static int getMin(int[] a){
        Arrays.sort(a);
        return a[0];
    }
    public static int getMid(int[] a){
        Arrays.sort(a);
        return a[((a.length)/2)];
    }
}
