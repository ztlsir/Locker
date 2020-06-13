import exception.NoRoomException;

public class Locker {

    private int size;
    private int count = 0;
    private Bag bag;

    public Locker(int size) {
        this.size = size;
    }

    public Ticket store(Bag bag) {
        if (count < size) {
            count++;
            this.bag = bag;
            return new Ticket();
        }
        throw new NoRoomException("The locker is full");
    }

    public Bag pickUp(Ticket ticket) {
        return bag;
    }
}
