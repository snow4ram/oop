package deomspringshop.shop.theater.step01;

//관람객.
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    //가방에 있는 모든 내용물 확인.

    public Long buy(Ticket ticket) {
        /*
        * 가방 안에 초대장이 있을경우
        * 가방안에 티켓 을 추가
        * */
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;

        }else {
            /*
             * 가방 안에 초대장이 없을 경우
             * 가방안에 티켓 을 추가 후 관람객이 직접 티켓에 가격을지불한다.
             * */
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
