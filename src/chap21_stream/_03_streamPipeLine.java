package chap21_stream;

import chap21_stream.clazz.HyundaiCar;

import java.util.ArrayList;
import java.util.List;

public class _03_streamPipeLine {
    public static void main(String[] args) {
        List<HyundaiCar> hCarList = new ArrayList<HyundaiCar>();
        hCarList.add(new HyundaiCar("아반떼", 3000));
        hCarList.add(new HyundaiCar("아반떼", 2500));
        hCarList.add(new HyundaiCar("아반떼", 2000));
        hCarList.add(new HyundaiCar("제네시스", 5000));
        hCarList.add(new HyundaiCar("그랜져", 4000));
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

        //방법2. 체이닝 기법
        int totalPrice = hCarList.stream().filter(hCar->hCar.getModel().equals("아반떼")).mapToInt(hCar -> hCar.getPrice()).sum();
        System.out.println(totalPrice);
    }
}
