package homework_0328;

public class basic2 {
    public static <T> String add(T t1, T t2){
        StringBuilder str1 = new StringBuilder((String) t1);
        StringBuilder str2 = new StringBuilder((String) t2);
        return str1.append(t2).toString();
    }
}
