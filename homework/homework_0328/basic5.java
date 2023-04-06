package homework_0328;

public class basic5 {
    public static <T extends Number> T getMin(T[] arr) {
        T t = null;
        for(T i : arr){
            if(t == null|| i.doubleValue() > t.doubleValue()) t = i;
        }
        return t;
    }
}
