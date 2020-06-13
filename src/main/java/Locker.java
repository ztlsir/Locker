import exception.*;

public class Locker {

    private int size;
    private int count = 0;

    public Locker(int size) {
        this.size = size;
    }

    public Ticket store(Bag bag) {
        if (count < size) {
            count++;
            return new Ticket();
        }
        throw new NoRoomException("The locker is full");
    }
}
