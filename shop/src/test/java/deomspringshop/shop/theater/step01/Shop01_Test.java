package deomspringshop.shop.theater.step01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class Shop01_Test {

    LocalDateTime localDateTime = LocalDateTime.of(2022, 3, 9, 12, 11);

    Invitation invitation = new Invitation(localDateTime);
    @Test
    public void audience() {


        //가방 내부 상태 : 초대장:0, 현금:O
        Bag bag = new Bag(invitation,10000);

        //audience_A bag 소지
        Audience audience = new Audience(bag);

        //Ticket:
        Ticket ticket = new Ticket(1L);

        /*
        * TicketOffice 초기값 설정
        * */
        TicketOffice ticketOffice = new TicketOffice(1000L,ticket);

        TicketSeller ticketSeller = new TicketSeller(ticketOffice);

        Theater theater = new Theater(ticketSeller);

        theater.enter(audience);

        System.out.println("현재 관람객 소지금 금액"+ audience.getBag().getAmount());
    }
}
