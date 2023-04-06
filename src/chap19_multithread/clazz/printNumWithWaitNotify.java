package chap19_multithread.clazz;

public class printNumWithWaitNotify {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    //동기화 메소드
    public synchronized void printNum1(int num) throws InterruptedException {
        this.setNum(num);
        for (int i = 1; i <=this.num; i++) {
            notify();
            if (i%2!=0){
            System.out.println("1번 스레드: "+i);}
            //다른 스레드를 실행 대기 상태로 변경
            //wait()가 호출되어 일시 정지상태로 변경되기 전에 호출
            wait();
        }

    }
    public synchronized void printNum2(int num) throws InterruptedException{
        this.setNum(num);
        for (int i = 2; i <=this.num; i++) {
            notify();
            if (i%2==0){
            System.out.println("2번 스레드: "+i);}
            wait();
        }

    }
}
