package chap19_multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _06_reasonOfThread {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                selectBoaedList();
            }
        };
        t.start();
        //사용자가 많을 때 한 번에 데이터를 조회하면 DB가 데드락에 걸려서 현재 시스템의 DB전체를 사용할 수 없게 되기 때문에
        //사용자가 몰렸을 때 한 명씩 순차 처리를 해주는 역할을 Thread가 해주가 된다.
        //사용자의 수 만큼 스레드를 생성할 수 있다. 대기열을 사용할 때 사용한다.
    }
    static List<Map<String,String>> selectBoaedList() {
        List<Map<String, String>> boardList = new ArrayList<Map<String, String>>();
        return boardList;
    }
}
