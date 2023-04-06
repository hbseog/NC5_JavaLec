package chap19_multithread.clazz;

public class SyncThread1 extends Thread{
    private printNumWithSync pns = new printNumWithSync();

    public printNumWithSync getPns() {
        return pns;
    }

    public void setPns(printNumWithSync pns){
        this.pns = pns;
    }
    @Override
    public void run() {
        try {
            pns.printNum1(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
