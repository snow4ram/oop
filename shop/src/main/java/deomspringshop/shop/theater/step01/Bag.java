package deomspringshop.shop.theater.step01;

public class Bag {
    private Long amount;//현금
    private Invitation invitation;//초대장
    private Ticket ticket;//타켓

    //관람객 소지품
    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long getAmount() {
        return amount;
    }
    //초대장이 있다, 없다
    public boolean hasInvitation() {
        return invitation != null;
    }

    //티켓이 있다 , 없다
    public boolean hasTicket() {
        return ticket != null;
    }

    //Ticket 추가
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    //소지금 금액을 감소.
    public void minusAmount(Long amount) {
        this.amount = -amount;
    }

    //소지금 금액을 증가.
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}

