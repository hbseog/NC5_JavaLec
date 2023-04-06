package chap08_staric.clazz;

public class Add {
    public static String result;
    public static String add(int num1, int num2, String unit){
        result = (num1 + num2) + unit;
        return  result;
    }
}
