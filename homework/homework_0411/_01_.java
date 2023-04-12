package homework_0411;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _01_ {
    public static void main(String[] args) {
        Solution aa = new Solution();
        //https://school.programmers.co.kr/learn/courses/30/lessons/42576
        String[] a = {"mislav", "stanko", "mislav", "ana"};
        String[] b = {"stanko", "ana", "mislav"};
        System.out.println(aa.solution(a,b));
    }
    public static class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Map<String,Integer> map = new HashMap<String,Integer>();
            for (int i = 0; i < participant.length; i++) {
                if (!map.containsKey(participant[i])) map.put(participant[i],1);
                else map.replace(participant[i],(map.get(participant[i]))+1);
            }
            for (int i = 0; i < completion.length; i++) {
                if (map.containsKey(completion[i])) map.replace(completion[i],(map.get(completion[i]))-1);
            }
            for(Entry<String,Integer> i : map.entrySet()){
                if(i.getValue()>0) answer += i.getKey();
            }
            return answer;
        }
    }
}
//            for (int i = 0; i < participant.length; i++) {
//                for (int j = 0; j < completion.length; j++) {
//                    if (participant[i].equals(completion[j])){
//                        participant[i] = "";
//                        completion[j] = "";
//                    }
//                }
//                answer += participant[i];
//            }