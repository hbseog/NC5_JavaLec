package homework_0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class middle {
    public static void main(String[] args) {
        //1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
        //  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
        Map<String,Integer> map = new HashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);
        Map.Entry<String,Integer> nt= null;
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1 + " 번째 이름 입력");
            System.out.println(i+1 + " 번째 점수 입력");
            map.put(sc.nextLine(),sc.nextInt());
            sc.nextLine();
        }
        nt = null;
        for(Map.Entry<String, Integer> i : map.entrySet()){
            if(nt==null || i.getValue()>nt.getValue()){
                nt = i;
            }
        }
        System.out.println(nt);
        System.out.println("제일 높은 학생: " + nt.getKey() + " / 제일 높은 점수: " + nt.getValue());
    }
}
