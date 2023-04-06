package homework_0328;

public class basic4 {
    public static <T> T printArr(T[] arr){
        int Cnt=0;
        T t=null;
        for(T i : arr){
            Cnt++;
            if (Cnt>=3&&Cnt%3==0) System.out.println(i);
        }
        return t;
    }
}
