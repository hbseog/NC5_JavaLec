package chap11_interface.building;

public class HighBuilding implements building{
    @Override
    public void build() {
        System.out.println("에어컨 가동");
    }

    @Override
    public void trunOnAircon() {
        System.out.println("에어컨 가동");

    }

    @Override
    public int getPartkinPrice(int time) {
        int totalPrice = time * price;
        return totalPrice;
    }
    //인터페이스를 상속받을 때는 implements키워드 사용
    //인터페이스를 상속받아 일부만 구현하려면 추상클래스로 선언한다.

}
