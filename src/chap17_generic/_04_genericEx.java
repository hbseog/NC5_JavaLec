package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(getEven(list));
    }
    //Number를 상속받는 T, return타입은 List<T>, 메소드명: getEven(List<T> list){} 리스트의 짝수만 리턴
    public static <T extends Number> List<T> getEven(List<T> list){
        for (int i=0; i<list.size();i++){
            if ((int)list.get(i)==1||(int)list.get(i)%2!=0){
                list.remove(i);
            }
        }
        return list;
    }
}
