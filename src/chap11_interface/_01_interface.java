package chap11_interface;

import chap11_interface.building.HighBuilding;
import chap11_interface.building.building;

public class _01_interface {
    public static void main(String[] args) {
        //인터페이스는 인스턴스화가 불가능하기 때문에 상속받은 자식클래스를 인스턴스화해서 사용해야한다.
        building bd = new HighBuilding();
        bd.build();
        bd.trunOnAircon();
        int price = bd.getPartkinPrice(120);
        System.out.println();
    }
}
