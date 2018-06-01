public interface Queue<T> {

    boolean isEmpty();

    boolean isFull();

    int size();

    void insertLast(T value);

    T removeFirst();

    T peekFirst();

}
