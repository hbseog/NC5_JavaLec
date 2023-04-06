package chap16_collectionFramework;

import chap06_class.car.Car;

import java.util.*;

public class _08_hashMap {
    public static void main(String[] args) {
        Map<String, String > carMap = new HashMap<String,String>();
        carMap.put("company", "현대");
        carMap.put("model", "소나타");
        carMap.put("color", "검정색");
        carMap.put("price", "4000");
        System.out.println(carMap);

        //Map의 데이터값을 확인할 때 Entry의 Set을 생성하고 Iterator를 꺼내서 Key, Value를 하나씩 확인한다.
        Set<Map.Entry<String,String>> carSet = carMap.entrySet();
        System.out.println(carSet.toString());
        Iterator<Map.Entry<String,String>> it = carSet.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> ent = it.next();
            System.out.println(ent.getKey());
            System.out.println(ent.getValue());
        }

        //Value값을 Object로 지정하면 어떤 형태의 데이터도 받을 수 있다.
        Map<String,Object> objMap = new HashMap<String,Object>();
        List<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < 5; i++) {
            Car car = new Car("현대", "소나타20"+(10+i), "검정", 3000);
            carList.add(car);
        }

        objMap.put("carList",carList);
        /*
        *objMap: {
        *           carList : [
        *                       car: {}
        *                       car: {}
        *                       car: {}
        *           ]
        *           carList :
        */
        System.out.println(objMap);
    }
}
