package chap19_multithread;

public class _02_anonymousThread {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                for (int i = 1; i <=5 ; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t.start();
        for (int i = 6;i<=10; i++){
            System.out.println(i);
        }
    }
}
