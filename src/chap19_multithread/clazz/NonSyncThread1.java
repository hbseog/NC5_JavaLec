package chap19_multithread.clazz;

public class NonSyncThread1 extends Thread{
    public printNumWithoutSync getPns() {
        return pns;
    }

    private printNumWithoutSync pns = new printNumWithoutSync();
    public void setPns(printNumWithoutSync pns){
        this.pns = pns;
    }
    @Override
    public void run() {
        try {
            pns.printNum1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
