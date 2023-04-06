package chap11_interface.multiiherit;

public class SeoulMultiflexStadium implements MultiflexStadium{

    @Override
    public void printSchedule(int month) {
        System.out.println(month + "월에 예정된 콘서트는는 싸이 콘서트 입니다.");
    }

    @Override
    public int getTicketPrice(int people) {
        return people*96000;
    }

    @Override
    public void getRemainSeat() {
        System.out.println("남아있는 좌석은 총 1000자리 입니다.");
    }

    @Override
    public void platSportsAndConcert() {
        System.out.println("수원 vs 서울 경기에서 싸이콘서트도 동시에 진행될 예정입니다.");
    }

    @Override
    public void getSportsSchedule(int month) {
        System.out.println(month + "월에 예정된 경기는 '수원 vs 서울' 입니다.");
    }

    @Override
    public int getSportsTicketPrice(int people) {
        return people*7000;
    }

    @Override
    public void getSupporterItem(int people) {
        System.out.println(people+"명의 아이템 구매 가격은: " + people*15000);
    }
}
