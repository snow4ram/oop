package deomspringshop.shop.theater.step01;


//Theater : 극장
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /*
    * audience : 관람객, enter : 들어가다,입장하다.
    * ticketSeller.sellTo() : 티켓 판매자 판매 대상.
    * enter 메서드에 역할은 관람객에게 티켓을 판매한다.
    * */
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
