package deomspringshop.shop.theater.step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

    private Long amount;

    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
//        this.tickets.addAll(Arrays.asList(tickets));
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    //금액 마이너스
    public void minusAmount(Long amount) {
        this.amount = -amount;
    }

    //금액 플러스
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
