package chap21_stream;

import java.util.ArrayList;
import java.util.List;

public class _13_match {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            intList.add(i);
        }
        //1. 모든 요소가 3의 배수인지
        boolean result=intList.stream().allMatch(num->num%3==0);
        System.out.println("모든 요소가 3의 배수인지: " + intList.stream().allMatch(num->num%3==0));

        //2. 2의 배수가 하나라도 존재하는지
        result = intList.stream().anyMatch(num->num%2==0);
        System.out.println("2의 배수가 하나라도 존재하는지: " + result);

        //3. 모든 요소가 11의 배수가 아닌지
        result = intList.stream().noneMatch(num->num%11==0);
        System.out.println("모든 요소가 11의 배수가 아닌지: " + result);
    }
}
