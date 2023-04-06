package chap19_multithread;

import chap19_multithread.clazz.BoardDAO;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _17_threadEx {
    public static void main(String[] args) {
        //최대 스레드의 개수가 100인 스레드풀을 생성
        //풀에 있는 스레드를 하나씩 대여하는 방식으로 한 번에 100명까지의 사용자 요청만 동시처리.
        //이후 작업이 끝나면 스레드를 반납 받아서 대기중인 사용자에게 다시 대여
        
        BoardDAO boardDAO = new BoardDAO();
        ExecutorService es = Executors.newFixedThreadPool(100);

        //아래방식은 스레드가 기하급수적으로 생성되기 때문에 많은 사용자가 접속하면 서버에 과부하가 발생한다.
        //스레드풀을 사용하여 최대 스레드의 개수를 지정할 수 있다.
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(boardDAO.selectBoardList());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        //thread.start();
        //스레드 풀에 있는 스레드에 작업을 매핑해주고 스레드.start() 메소드까지 호출
        //스레드풀에 스레드가 없다면 대기
        es.execute(thread);
    }
}
