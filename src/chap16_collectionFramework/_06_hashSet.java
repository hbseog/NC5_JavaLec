package chap16_collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _06_hashSet {
    public static void main(String[] args) {
        Set<String> str = new HashSet<String>();
        str.add("Java");
        str.add("JDBC");
        str.add("Javascript");
        str.add("Html/Css");

        //중복 값 저장
        str.add("JDBC");
        str.add("Java");
        str.add("React.js");

        System.out.println("str의 크기: " + str.size());

        int index=0;
        Iterator<String> it = str.iterator();
        while (it.hasNext()) {//다음 요소가 있는지){
            String str2 = it.next();
            System.out.println(index++ +" : " + str2);
            if(str2.equals("Html/Css")){
                System.out.println(index ++ + " : " + str2);
            }
        }
        str.remove("JDBC");
        System.out.println("str의 크기: " + str.size());

        str.clear();
        if(str.isEmpty()) {
            System.out.println("str은 비었습니다.");
        }
        else
            System.out.println("str은 안비었습니다.");

    }
}
