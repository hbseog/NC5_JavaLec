package chap17_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _03_limitGeneric {
    public static void main(String[] args) {
        //리스트를 받아서 리스트 요소의 합계를 리턴
        List<Long> lList = new ArrayList<Long>();
        for (int i = 0; i < 10; i++) {
            lList.add((long)5*i);
        }
        //System.out.println(_03_limitGeneric.sumList(lList));
        List<Number> numList = new ArrayList<Number>();
        for (int i = 0; i < 10; i++) {
            numList.add((Integer)3*i);
        }
        //System.out.println(_03_limitGeneric.max(numList));
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), Integer.valueOf((int)(Math.random() * 100) + 1));
            System.out.println(map);
        }
        System.out.println(maxKey(map));
    }
    public static <T extends Number> double sumList(List<T> tList){
        double sum=0;
        for(T t : tList){
            sum += t.doubleValue();
        }
        return sum;
    }
    //와일드카드로 특정클래스의 부모클래스와 특정클래스만 타입으로 지정 가능하도록 설정
    //와일드카드는 매개변수만 사용 가능
    public static int max(List<? super Integer> list){
        int max = (int)list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if((int)list.get(i)>max){
                max = (int) list.get(i);
            }
        }
        return max;
    }
    public static <K,V extends Number> int sumMapValue(Map<K,V> map){
        int sum = 0;
        for (V v : map.values()){
            sum += (int)v;
        }
        return sum;
    }
    //Map의 value의 최대값을 찾고 해당 키값을 리턴하는 메소드
    public static <K,V extends Number> K maxKey(Map<K,V> map){
        K maxkey=null ;
        V maxVal=null ;
        Entry<K,V> en = null;
        int a = 0;
        for (Entry<K,V> i : map.entrySet()){
            if(a==0){
                maxkey = i.getKey();
                maxVal = i.getValue();
                a++;
            } else {
                if (maxVal.doubleValue() < i.getValue().doubleValue()) {
                    maxkey = i.getKey();
                    maxVal = i.getValue();
                }
            }
        }
        return maxkey;
    }
}
