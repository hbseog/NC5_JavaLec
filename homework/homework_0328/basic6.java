package homework_0328;

import java.util.Map;
import java.util.Map.Entry;

public class basic6 {
    public static  <K,V> void printOverTen(Map<K,V> map){
        for (Entry<K,V> i : map.entrySet()){
            if(i.getValue().toString().length() >=10){
                System.out.println(i.getKey());
            }
        }
    }
}
