package homework_0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//    (Map<Character, Integer> 형태의 Map과 Entry 사용)
public class advance1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                map.replace(str.charAt(i), Integer.valueOf(map.get(str.charAt(i))+1));
            }
            else {
                map.put(str.charAt(i),1);
            }
        }
        Entry<Character,Integer> max = null;
        for(Entry<Character,Integer> i : map.entrySet()){
            if(max == null || i.getValue()>max.getValue()){
                max=i;
            }
        }
        System.out.println(map);
        System.out.println("제일 많이 나온 문자열: " + max.getKey() + " / 횟수: " + max.getValue());
        sc.close();
    }
}
