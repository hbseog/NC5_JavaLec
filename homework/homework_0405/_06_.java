package homework_0405;

import java.util.ArrayList;
import java.util.List;

public class _06_ {
    public static void main(String[] args) {
        List<Card> cList = new ArrayList<Card>();
        cList.add(new Card("a", 3));
        cList.add(new Card("b", 1));
        cList.add(new Card("c", 0));
        cList.add(new Card("d", 1));
        cList.add(new Card("e", 2));
        cList.add(new Card("f", 5));

        cList.stream().filter(cc -> cc.getValidYear() <= 1).forEach(a -> {
            a.validEnlong(3, y -> a.setValidYear(a.getValidYear() + y));
            System.out.println("3년 연장되었습니다.");
            System.out.println(a.getCardName() + "카드의 유효기간은 " + a.getValidYear() + "년 입니다.");
            System.out.println();
        });
    }
}
