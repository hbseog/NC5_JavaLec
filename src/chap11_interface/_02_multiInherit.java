package chap11_interface;

import chap11_interface.multiiherit.MultiflexStadium;
import chap11_interface.multiiherit.SeoulMultiflexStadium;

public class _02_multiInherit {
    public static void main(String[] args) {
        MultiflexStadium ms = new SeoulMultiflexStadium();
        ms.getSportsSchedule(3);
        ms.getSportsTicketPrice(2);
        int sportsTicket = ms.getSportsTicketPrice(2);
        ms.getSportsTicketPrice(2);
        ms.getRemainSeat();
        int concertTicketPrice = ms.getTicketPrice(2);
        //MultiflexStadium이 stadium솨 cocerthall의 형태를 가지고 있기 떄문에
        //MultiflexStadium도 stadium, concertHall의 형태를 가지게 된다. stadium타입의 변수나 concerthall타입의 변수로도 가능하다
    }
}
