package chap19_multithread.clazz;

public class printNumWithSync {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    //동기화 메소드
    public synchronized void printNum1(int num) throws InterruptedException {
        this.setNum(num);
        for (int i = 1; i <=this.num; i++) {
            System.out.println(i);
            Thread.sleep(300);
        }
    }
    public synchronized void printNum2(int num) throws InterruptedException{
        this.setNum(num);

        for (int i = this.num; i <=this.num*2; i++) {
            System.out.println(i);
        }
    }
}
