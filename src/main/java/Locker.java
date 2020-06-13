import exception.*;
import lombok.*;

import java.util.*;

public class Locker {

    private int size;
    private Map<Ticket, Bag> bagMap = new HashMap<>();;

    public Locker(int size) {
        this.size = size;
    }

    public Ticket store(Bag bag) {
        if (bagMap.size() >= size) {
            throw new NoRoomException("The locker is full");
        }
        var ticket = new Ticket();
        bagMap.put(ticket, bag);
        return ticket;
    }

    public Bag pickUp(Ticket ticket) {
        if (!bagMap.containsKey(ticket)) {
            throw new InvalidTicketException("The ticket is invalid");
        }
        var bag = bagMap.get(ticket);
        bagMap.remove(ticket);
        return bag;
    }
}
