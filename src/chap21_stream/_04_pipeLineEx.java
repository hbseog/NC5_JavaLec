package chap21_stream;

import chap21_stream.clazz.CreditCard;

import java.util.ArrayList;
import java.util.List;


public class _04_pipeLineEx {
    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<CreditCard>();
        cardList.add(new CreditCard("카카오", "라이언카드", 1000));
        cardList.add(new CreditCard("삼성카드", "탭탭카드", 2000));
        cardList.add(new CreditCard("신한카드", "드림카드", 3000));
        cardList.add(new CreditCard("삼성카드", "ID카드", 5000));
        cardList.add(new CreditCard("현대카드", "더블랙", 100000));
        cardList.add(new CreditCard("아멕스", "블랙카드", 300000));


        //cardList.stream().forEach(lim -> {if (lim.getLimitMoney() >= 5000) System.out.println(lim.getCompany() + " : " + lim.getCardName());});
        //        //방법1.
//        //1. 현대차 리스트에서 스트림 얻기
//        Stream<HyundaiCar> hCarStream = hCarList.stream();
//
//        //2. 조건에 맞는 현대차 필터링 아반떼로만 스트림 구성(중간처리)
//        Stream<HyundaiCar> avanteStream = hCarStream.filter(hCar ->hCar.getModel().equals("아반떼"));
//
//        //3. 스르팀 타입변환(중간처리) - 모델이 아반떼인 요소들의 가격만 모아서 새로운 스트림 구성
//        IntStream priceStream = avanteStream.mapToInt(avante-> avante.getPrice());
//
//        //4. 가격들의 총합(최종처리)
//        int totalPrice = priceStream.sum();
//        System.out.println("아반떼 가격의 총합: " + totalPrice);
        cardList.stream().map(c-> {c.setCompany("삼성카드");c.setLimitMoney(c.getLimitMoney()+3000); return c;}).forEach(ca-> System.out.println(ca.toString()));
        List<Integer> intlist = new ArrayList<Integer>();
        for (int i = 1; i <=30; i++) {
            intlist.add(i);
        }
        int sum = intlist.stream().reduce((result, num)-> result+num).get();
        System.out.println(sum);
    }
}
