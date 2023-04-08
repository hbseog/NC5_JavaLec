package chap21_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _10_sorted {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            intList.add(i);
        }//Comparator.reverseOrder(): 역순(내림차순)으로 정렬
        intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
