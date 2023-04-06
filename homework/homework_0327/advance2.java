package homework_0327;

import java.util.*;
import java.util.Map.Entry;

public class advance2 {
    //2. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
    //    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
    //    ex) [1, 2, 3, 4, 5] => 4, 5 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        Map<Integer, ArrayList<Integer>> aa = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 != list.size()) {
                ArrayList<Integer> num = new ArrayList<Integer>();
                num.add(list.get(i));
                num.add(list.get(i+1));
                aa.put(list.get(i) + list.get(i + 1),num);
            }
        }
        Entry<Integer, ArrayList<Integer>> aaaaa = null;
        for (Entry<Integer, ArrayList<Integer>> i : aa.entrySet()) {
            if (aaaaa == null || aaaaa.getKey() < i.getKey()) {
                aaaaa = i;
            }
        }
        System.out.println(aaaaa.getValue());
    }
}

