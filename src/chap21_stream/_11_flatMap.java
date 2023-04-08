package chap21_stream;

import java.util.Arrays;

public class _11_flatMap {
    public static void main(String[] args) {
        Integer[][] intArr = {{1,2},{3,4},{5,6}};
        Arrays.stream(intArr).flatMap(Arrays::stream).map/*옵션*/(num -> num*3).forEach(num-> System.out.println(num));
    }
}
