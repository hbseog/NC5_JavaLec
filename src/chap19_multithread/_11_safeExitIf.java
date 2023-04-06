package chap19_multithread;

import chap19_multithread.clazz.whileThread;

public class _11_safeExitIf {
    public static void main(String[] args) {
        whileThread wt = new whileThread();
        wt.start();
        try {
            //메인 스레드를 1초동안 일시 정지 후 whileThread가 1초동안 반복 실행
            Thread.sleep(1000);
        }catch (InterruptedException ie){
            System.out.println(ie);
        }
        wt.setStop(true);
    }
}
