package homework_0410;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _01_ {
    public static void main(String[] args) {
        //2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
        // 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
        // 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
        System.out.println(solution(5,24));
    }
        public static String solution(int a, int b) {
            Map<Integer,Integer> days = new HashMap<Integer,Integer>();
            days.put(1,31);days.put(2,29);days.put(3,31);days.put(4,30);days.put(5,31);days.put(6,30);
            days.put(7,31);days.put(8,31);days.put(9,30);days.put(10,31);days.put(11,30);days.put(12,31);
            int sumDays=0;
            for(Entry<Integer,Integer> i : days.entrySet()){
                if (a == i.getKey()) break;
                sumDays += i.getValue();
                System.out.println(sumDays);
            }
            sumDays+=b;
            System.out.println(sumDays);
            String[] dayOfWeek = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
            String answer;
            if (sumDays<7) answer=dayOfWeek[sumDays];
            else answer = dayOfWeek[(sumDays%7)];
            return answer;
        }
}
