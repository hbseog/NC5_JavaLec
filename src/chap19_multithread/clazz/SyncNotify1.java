package chap19_multithread.clazz;

public class SyncNotify1 extends Thread{
    private printNumWithWaitNotify pns = new printNumWithWaitNotify();

    public printNumWithWaitNotify getPns() {
        return pns;
    }

    public void setPns(printNumWithWaitNotify pns){
        this.pns = pns;
    }
    @Override
    public void run() {
        try {
            pns.printNum1(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
