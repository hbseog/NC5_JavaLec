package chap19_multithread;

import chap19_multithread.clazz.interruptThread;

public class _12_safeExitInterrupt {
    public static void main(String[] args) {
        interruptThread wt= new interruptThread();
        wt.start();
        try {
            //메인 스레드를 1초동안 일시 정지 후 whileThread가 1초동안 반복 실행
            Thread.sleep(1000);
        }catch (InterruptedException ie){
            System.out.println(ie);
        }
        //main 스레드가 일지 정지 상태에서 풀리기 전까지는 실행x
        wt.interrupt();
        //interrupt() 가 실행된 이후에 run()를 실행하는 데 일시 정지 코드를 만나면 InterruptedException을 발생시켜 catch구문으로 빠지면서 스레드가 종료.
        //catch 구문에서 리소스 정리 코드를 작성한다.
    }
}
