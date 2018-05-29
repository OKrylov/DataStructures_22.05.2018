public class QueueImpl implements Queue {

    private  int[] data;
    private  int currentSize;

    private int front;
    private int rear;

    public QueueImpl(int size) {
        this.data = new int[size];
        this.currentSize = 0;
        this.front = 0;
        this.rear = -1;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean isFull() {
        return currentSize >= data.length;
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public void insert(int value) {
        if (rear == data.length - 1) {
            rear = -1;
        }
        data[++rear] = value;
        currentSize++;
    }

    @Override
    public int remove() {
        int value = data[front++];
        if (front == data.length) {
            front = 0;
        }
        currentSize--;
        return value;
    }

    @Override
    public int peek() {
        return data[front];
    }
}
