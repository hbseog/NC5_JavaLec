package chap21_stream;

import chap21_stream.clazz.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _16_groupingBy {
    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<CreditCard>();
        cardList.add(new CreditCard("a","A",100));
        cardList.add(new CreditCard("a","B",300));
        cardList.add(new CreditCard("a","C",600));
        cardList.add(new CreditCard("b","D",500));
        cardList.add(new CreditCard("b","E",800));
        cardList.add(new CreditCard("c","F",200));
        cardList.add(new CreditCard("c","G",500));
        
        //1. groupingBy로 Map<company, List<CreditCard>>
        Map<String,List<CreditCard>> companyCardMap = cardList.stream().collect(Collectors.groupingBy(/*키를 구하는 메소드*/card -> card.getCompany()));
        System.out.println(companyCardMap.toString());

        //2. gtoupingBy메소드로 Map<company, average(limitMoney)>
        Map<String,Double> avgLimMoneyMap = cardList.stream()
                .collect(
                        Collectors.groupingBy(
                                /*키를 구하는 메소드*/card -> card.getCompany(),Collectors.averagingDouble(
                                        card -> card.getLimitMoney()
                                )
                        )
                );
        System.out.println(avgLimMoneyMap.toString());
    }
}
