package homework_0404;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class generic_01_ {
    public static void main(String[] args) {
        //Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요.
        //   매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 100을 넘는 Entry만 List에 저장합니다.
        Map<Integer,Integer> aa = new HashMap<Integer,Integer>();
        aa.put(50,10);
        aa.put(60,20);
        aa.put(51,20);
        aa.put(52,20);
        System.out.println(getOverHundr(aa));
    }
    public static <K, V> List<Entry<K,V>> getOverHundr(Map<Integer,Integer> map){
        List<Entry<K,V>> a = new ArrayList<Entry<K,V>>();
        for (Entry<Integer,Integer> i : map.entrySet()){
            if(i.getKey()*i.getValue() >= 1000){
                a.add((Entry<K, V>)i);
            }
        }
        return a;
    }
}
