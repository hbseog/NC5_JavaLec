package chap19_multithread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class _16_threadPool2 {
    public static void main(String[] args) {
        ThreadPoolExecutor es =
                (ThreadPoolExecutor)Executors.newFixedThreadPool(5);

        //Thread-0
        PrintThread t1 = new PrintThread();
        t1.settName(t1.getName());
        //execute(): 해당 스레드를 풀에 등록하면서 start()도 호출한다.
        es.execute(t1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //스레드 풀의 스레드들은 데몬 스레드가 아니기 때문에 메인 스레드가 종료돼도 계속 남아서 작업을 진행한다.
        //shutdownNow을 통해 메인 스레드가 종료되기 전에 스레드 풀을 종료시켜야 한다.
        es.shutdownNow();
        //PrintThread t2 = new PrintThread();

        //t2.settName("스레드 2번");

        //for(int i = 0; i < 10; i++) {
        //	t1.settName(t1.getName() + i);
        //
        //t1.start();
        //스레드를 5개까지 가지는 풀
        //excute(스레드) : 스레드를 풀에 저장
        //         (새로 생성 또는 풀에 있는 스레드를 이용해서)
        // 0~4: 5개 저장
        // 5가 들어오면 1~5 5개 저장
        // 0~9: 스레드를 각 각 1회씩 실행
        //	System.out.println(i);
        //	es.execute(t1);

        //es.execute(t2);
        //}
//		List<Runnable> rList =
//					es.shutdownNow();
//
//		for(Runnable r : rList) {
//			System.out.println(r);
//		}
    }

}

class PrintThread extends Thread {
    private String tName;

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettName() {
        return tName;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println(tName + " 작업 진행");

            try {
                Thread.sleep(100);
            } catch(InterruptedException ie) {
                System.out.println(tName +
                        " shutdownNow() 호출");
                return;
            }
        }
    }
}
