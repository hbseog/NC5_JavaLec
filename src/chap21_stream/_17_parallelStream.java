package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _17_parallelStream {
    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            scoreList.add((int)(Math.random()*100)+1);
        }
        //일반 스트림과 병렬 스트림의 속도차이
        double avg = 0;
        long startTime = 0, endTime = 0;
        
        //1. 일반 스트림 평균 구하기
        Stream<Integer> scoreStream = scoreList.stream();
        startTime = System.nanoTime();
        avg = scoreStream.mapToInt(num -> num).average().getAsDouble();
        endTime = System.nanoTime();
        System.out.println("일반스트림 처리 소요시간: " + (endTime-startTime));
        System.out.println("평균: " + avg);
        
        //2. 병렬처리 속도 계산
        Stream<Integer> pScoreStream = scoreList.parallelStream();
        startTime = System.nanoTime();
        avg = pScoreStream.mapToInt(a ->a).average().getAsDouble();
        endTime = System.nanoTime();
        System.out.println("병렬스트림 처리 소요시간: " + (endTime-startTime));
        System.out.println("평균: " + avg);
    }
}
