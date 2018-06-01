import java.lang.reflect.Array;

public class ArrayDeque<T> implements Deque<T>, Cloneable {

    private static final int DEFAULT_FRONT = 0;
    private static final int DEFAULT_REAR = -1;

    private T[] array;
    int maxSize;

    int itemsCount = 0;

    int front = DEFAULT_FRONT;
    int rear = DEFAULT_REAR;


    public ArrayDeque(Class<T> type, int maxSize) {
        this.maxSize = maxSize;
        this.array = (T[]) Array.newInstance(type, maxSize);
    }

    @Override
    public void insertFirst(T value) {
        if (front - 1 < 0)
            front = maxSize;

        array[--front] = value;
        itemsCount++;
    }

    @Override
    public T removeLast() {
        if (rear < 0)
            rear = maxSize - 1;

        T value = array[rear--];
        itemsCount--;

        return value;
    }

    @Override
    public boolean isEmpty() {
        return itemsCount == 0;
    }

    @Override
    public boolean isFull() {
        return itemsCount == maxSize;
    }

    @Override
    public int size() {
        return itemsCount;
    }

    @Override
    public void insertLast(T value) {
        if (rear == maxSize - 1)
            rear = DEFAULT_REAR;

        array[++rear] = value;
        itemsCount++;
    }

    @Override
    public T removeFirst() {
        T value = array[front++];

        if (front == maxSize) {
            front = DEFAULT_FRONT;
        }

        itemsCount--;

        return value;
    }

    @Override
    public T peekFirst() {
        return array[front];
    }

    @Override
    public T peekLast() {
        return array[rear];
    }

    @Override
    public Deque clone() {
        try {
            return (Deque) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to copy deque");
        }
    }
}
