import exception.NoRoomException;
import lombok.*;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LockerTest {

    @Test
    public void should_return_a_ticket_when_storing_a_bag_given_a_locker_with_one_available_cell() {
        var locker = new Locker(1);
        var bag = new Bag();

        var ticket = locker.store(bag);

        assertThat(ticket).isInstanceOf(Ticket.class);
    }

    @Test
    void should_throw_noRoomException_when_storing_a_bag_given_a_locker_with_no_available_cell() {
        var locker = new Locker(1);
        var bag = new Bag();

        locker.store(bag);

        var anotherBag = new Bag();
        assertThatThrownBy(() -> locker.store(anotherBag)).isInstanceOf(NoRoomException.class);
    }
}
