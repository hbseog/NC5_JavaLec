package chap19_multithread;

import chap19_multithread.clazz.SumThread1;
import chap19_multithread.clazz.SumThread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _15_threadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        es.execute(new SumThread1());
        es.execute(new SumThread2());
        for (int i = 1; i <= 10; i++) {
            if (i==3) break;
        }
        
        //메인메소드가 종료돼도 큐에 남아있는 작업들을 무도 처리하고 풀 종료
        es.shutdown();
    }
}
