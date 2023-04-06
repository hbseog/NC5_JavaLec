package chap19_multithread;

import chap19_multithread.clazz.*;

public class _10_waitNotify {
    public static void main(String[] args) {
        printNumWithWaitNotify pns = new printNumWithWaitNotify();
        SyncNotify1 t1 = new SyncNotify1();
        SyncNotify2 t2 = new SyncNotify2();
        t1.setPns(pns);
        t2.setPns(pns);
        //t1 스레드가 공유 객체인 pns의 num울 선점했기 때문에 동기화 블록과 메소드를 통해서 선점한 스레드의 작업이 종료되기 전까지 num을 사용할 수 없도록 잠금처리.
        //num을 사용할 수 있는 t1의 작업 종료 까지 대기
        t1.start();
        t2.start();
    }
}
