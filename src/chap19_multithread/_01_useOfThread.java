package chap19_multithread;

public class _01_useOfThread {
    public static void main(String[] args) {
        //스레드의 정의
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        //2. 스레드 실행
        thread.start();
        for (int i = 6; i <= 10; i++) {
            System.out.println(i);
            try {
                //0.5초 멈추면 다음 스레드로 넘어감
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
