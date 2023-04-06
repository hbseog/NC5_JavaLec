package chap19_multithread.clazz;

public class interruptThread extends Thread {

    @Override
    public void run() {
        //try {
        while (true) {
            System.out.println("스레드 실행됨");
            //Thread.sleep(1);
            //Thread.interruptrd(): interrupt가 발생했는지를 확인. interrupt를 사용해서도 스레드를 종료할 수 있다.
            
            //interrupt가 발생하면 true 리턴
            if (Thread.interrupted()) {
                break;
            }
        }
        //}
//        catch (InterruptedException ie){
//            System.out.println(ie.getMessage());
//            System.out.println("스레드 종료");
//        }finally {
//            //try~catch에 대한 후처리
//        }
    }
}

