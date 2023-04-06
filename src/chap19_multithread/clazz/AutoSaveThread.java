package chap19_multithread.clazz;

public class AutoSaveThread extends Thread{
    private void save(){
        System.out.println("자동 저장되었습니다.");
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            save();
        }
    }
}
