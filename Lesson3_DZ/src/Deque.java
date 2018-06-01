public interface Deque<T> extends Queue<T> {

    void insertFirst(T value);

    T removeLast();

    T peekLast();
}
