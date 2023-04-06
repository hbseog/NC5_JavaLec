package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _05_LlinkedList {
    public static void main(String[] args) {
        //ArrayList와 LinkList속도비교
        List<String> aList = new ArrayList<String>();
        List<String> lList = new  LinkedList<String>();
        long startTime;
        long endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            aList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList에 순차적으로 데이터를 추가하는 데 걸린 시간"+(endTime-startTime)+"ns");


        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            lList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList에 순차적으로 데이터를 추가하는 데 걸린 시간"+(endTime-startTime)+"ns");
        System.out.println("------------------------------");
        
        //contains 메소드 속도 비교
        startTime = System.nanoTime();
        aList.contains("900000");
        endTime = System.nanoTime();
        System.out.println("ArrayList에서 90만을 세는 시간"+(endTime-startTime)+"ns");

        startTime = System.nanoTime();
        lList.contains("900000");
        endTime = System.nanoTime();
        System.out.println("LinkedList에서 90만을 세는 시간"+(endTime-startTime)+"ns");
        System.out.println("------------------------------");


        startTime = System.nanoTime();
        aList.get(80000);
        endTime = System.nanoTime();
        System.out.println("ArrayList에서 8만을 찾는 시간"+(endTime-startTime)+"ns");

        startTime = System.nanoTime();
        lList.get(80000);
        endTime = System.nanoTime();
        System.out.println("LinkedList에서 8만을 찾는 시간"+(endTime-startTime)+"ns");
        System.out.println("------------------------------");



        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            aList.add(i,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList중간에 순차적으로 데이터를 추가하는 데 걸린 시간"+(endTime-startTime)+"ns");

        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            lList.add(i,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 중간에 순차적으로 데이터를 추가하는 데 걸린 시간"+(endTime-startTime)+"ns");
        System.out.println("------------------------------");


        //remove(int index) 인덱스로
        for (int i = 1000; i < 5000; i++) {
            aList.remove(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList중간에 데이터를 삭제하는 데 걸린 시간"+(endTime-startTime)+"ns");


        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            lList.remove(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList중간에 데이터를 삭제하는 데 걸린 시간"+(endTime-startTime)+"ns");

        
    }
}
