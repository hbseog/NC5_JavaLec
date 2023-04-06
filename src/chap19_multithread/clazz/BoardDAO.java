package chap19_multithread.clazz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardDAO {
    public List<Map<String,String>> selectBoardList(){
        List<Map<String,String>>boaedList = new ArrayList<Map<String,String>>();
        for (int i = 1; i < 1000000; i++) {
            Map<String,String> map = new HashMap<String,String>();
            map.put("boardNo",String.valueOf(i));
            map.put("boardTitle","test");
            map.put("boardContent","test입니다");
            map.put("boardWriter","홍길동");
            boaedList.add(map);
            /*
            [
                {
                    boardNo: i,
                    boardTitle: test,
                    boardContent: test입니다,
                    boardWriter: 홍길동
             */
        }
        return boaedList;
    }
}
