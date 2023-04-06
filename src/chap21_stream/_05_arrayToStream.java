package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _05_arrayToStream {
    public static void main(String[] args) {
        int [] intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = (int)(Math.random()*10)+1;
        }
        IntStream intStream = Arrays.stream(intArr);
        //5이상인 값들만 스트림으로 만들기

        IntStream intStream2 = intStream.filter(a->a>=5);
        //*4 새로운 스트림 만들기
        IntStream intStream3 = intStream2.map(a->a*4);

        //5이상인 값들만 스트림으로 만들기
        //*4 새로운 스트림 만들기
    }
}
