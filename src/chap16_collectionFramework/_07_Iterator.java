package chap16_collectionFramework;

import chap06_class.car.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class _07_Iterator {
    public static void main(String[] args) {
        //Map<String,String> map;
        List<Car> cList = new ArrayList<Car>();

        Car car = new Car("현대", "제네시스", "실버", 5000);
        cList.add(car);
        car = new Car("현대", "아반떼", "흰색", 3000);
        cList.add(car);
        car = new Car("현대", "소나타", "검은색", 4000);
        cList.add(car);
        car = new Car("기아", "ev6", "파랑", 4000);
        cList.add(car);
        car = new Car("현대", "g80", "검정", 8000);
        cList.add(car);
        System.out.println(cList.size());
        //Iterator를 요소들 받아오기
        Iterator it = cList.iterator();
        while (it.hasNext()){
            Car c = (Car)it.next();
            c.carInfo();
            if(c.company.equals("현대")){
                it.remove();
            }
        }
        System.out.println(cList.size());

        ListIterator<Car> lit = cList.listIterator();
        lit.next();
        while(lit.hasPrevious()){
                lit.previous();
                Car c = new Car("쉐보레", "카마로", "노란색", 4000);
                lit.set(c);
            }

        for (Car c : cList){
            c.carInfo();
        }
    }
}
