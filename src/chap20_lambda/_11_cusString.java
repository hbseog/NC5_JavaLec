package chap20_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _11_cusString {
    public static void main(String[] args) {
        List<CustomString> cList = new ArrayList<CustomString>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("문자열 입력");
            cList.add(new CustomString(sc.nextLine()));
        }

        System.out.println("검색할 문자 입력");
        char findChar = sc.nextLine().charAt(0);

        Stream<CustomString> cStream = cList.stream();
        cStream.forEach(a -> {
            a.changeStr(findChar, (b, c) -> {
                if (c.indexOf(b) == -1)
                    c = "";
                return c;
            });
            System.out.println(a.getStr());
        });

    }
}
