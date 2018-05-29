public interface Queue {

    boolean isEmpty();

    boolean isFull();

    int getSize();

    void insert(int value);

    int remove();

    int peek();
}
