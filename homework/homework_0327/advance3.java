package homework_0327;

import java.util.*;
import java.util.Map.Entry;

public class advance3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            list.add(Integer.valueOf(num));
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0; i<list.size()-1;i++){
            map.put(list.get(i) + list.get(i + 1),1);
            if (map.containsKey(list.get(i))){
                map.replace(list.get(i), Integer.valueOf(map.get(list.get(i))+1));
            }
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(Entry<Integer,Integer> i : map.entrySet()){
            if (i.getValue()==1){
                list2.add(i.getKey());
            }
        }
        System.out.println(map);
        System.out.println("유일한 숫자 총: "+list2.size()+"개 => " + list2);
    }
}
