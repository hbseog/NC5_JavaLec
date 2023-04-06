package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01_streamForEach {
    static int sum = 0;
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            //intList.add((int)(Math.random()*10)+1);
            intList.add(i);
        }
                                            //병렬처리 스트림(스레드 풀을 사용한다.)
        Stream<Integer> intStream = intList.parallelStream();
        intStream.forEach(num -> {
            System.out.println(num + ":" + Thread.currentThread().getName());
        });
//        intStream.forEach(number -> sum += number);
//        System.out.println("총합: " + sum);
    }
}
