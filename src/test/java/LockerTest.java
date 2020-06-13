import lombok.*;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class LockerTest {

    @Test
    public void should_return_a_ticket_when_storing_a_bag_given_a_locker_with_one_available_cell() {
        var locker = new Locker(1);
        var bag = new Bag();

        var ticket = locker.store(bag);

        assertThat(ticket).isInstanceOf(Ticket.class);
    }
}