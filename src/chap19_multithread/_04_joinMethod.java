package chap19_multithread;

public class _04_joinMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                for (int i = 6 ; i <10; i++) {
                    System.out.println(i);
                }
            }
        };
        //t1 실행 대기 상태로
        t1.start();
        try {
            //메인 스레드를 일시 정지 상태로 변경, t1의 run()이 종료될 때 까지 대기
            //t1의 run이 종료되면 메인스레드가 실행 대기 상태로 변경된다.
            t1.join();
        } catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }

        //메인 스레드의 작업
        for(int i = 1; i<=5; i++){
            System.out.println(i);
        }
    }
}
