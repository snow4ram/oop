package deomspringshop.shop.theater.step01;

/*
* TicketSeller : 매표원
*
**/
public class TicketSeller {

    private final TicketOffice ticketOffice; //매표소

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /*
    * sell To : 팓다
    *
    * */
    public void sellTo(Audience audience) {
        /*
        * 티켓 판매소에서 판매 금액을 증가한다.
        * audience 티켓을 매표소에서 티켓을 구매한다.
        * */
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }

}
