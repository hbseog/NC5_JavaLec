package chap11_interface.building;

public interface building {
    int price = 100;
    int floors = 120;
    //모든 변수는 자동으로 상수화

    void build();
    //모든 메소드는 자동으로 추상화
    void trunOnAircon();
    int getPartkinPrice(int time);
}
