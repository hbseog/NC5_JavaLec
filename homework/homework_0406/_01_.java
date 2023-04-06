package homework_0406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _01_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> sList = new ArrayList<String>();
        for (int i=0; i<5; i++){
            System.out.println("문자열을 입력하세요");
            sList.add(sc.nextLine());
        }
        Stream<String> sString = sList.stream().filter(a-> a.length()>=5);
        sString.forEach(b-> System.out.println(b));
    }
}
