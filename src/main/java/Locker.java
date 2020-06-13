import exception.*;
import lombok.*;

import java.util.*;

public class Locker {

    private int size;
    private int count = 0;
    private Map<Ticket, Bag> bagMap = new HashMap<>();;

    public Locker(int size) {
        this.size = size;
    }

    public Ticket store(Bag bag) {
        if (bagMap.size() < size) {
            var ticket = new Ticket();
            bagMap.put(ticket, bag);
            return ticket;
        }
        throw new NoRoomException("The locker is full");
    }

    public Bag pickUp(Ticket ticket) {
        if (!bagMap.containsKey(ticket))
            throw new InvalidTicketException("The ticket is wrong");
        return bagMap.get(ticket);
    }
}
