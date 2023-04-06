package chap16_collectionFramework;

import chap06_class.car.Car;

import java.util.*;

public class _09_listMapEx01 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car("현대", "제네시스", "흰색", 4000));
        carList.add(new Car("기아", "k9", "검은색", 6000));
        carList.add(new Car("벤츠", "c클래스", "갈색", 8000));
        carList.add(new Car("BMW", "520d", "회색", 7000));
        carList.add(new Car("쉐보레", "모닝", "노랑색", 1500));
        List<Map<String,Object>> mapList = new ArrayList<Map<String,Object>>();
        for(Car c : carList){
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("company",c.company);
            map.put("model",c.model);
            map.put("color",c.color);
            map.put("price",c.price);
            mapList.add(map);
        }
        for (int i=0;i<mapList.size();i++){
            System.out.println(mapList.get(i));
        }

//        carMap.put("carList",carList);
//        Iterator it = carList.iterator();
//        System.out.println(it.next());
//        List<Map<String,Object>> cList = new ArrayList<Map<String,Object>>();
//        cList = new
        //Map<String,Object> objMap = new HashMap<String,Object>();

    }
}
