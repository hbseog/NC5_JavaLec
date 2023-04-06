package chap19_multithread.clazz;

public class printNumWithoutSync {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    public void printNum1() throws InterruptedException {
        for (int i = 1; i <=this.num; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public void printNum2() throws InterruptedException{
        this.setNum(num);
        for (int i = this.num; i <=this.num*2; i++) {
            System.out.println(i);
        }
    }
}
