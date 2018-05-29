public class PriorityQueue implements Queue {

    private int[] data;
    private int currentSize;

    public PriorityQueue(int size) {
        this.data = new int[size];
        this.currentSize = 0;
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
        if (currentSize == 0) {
            data[currentSize++] = value;
            return;
        }

        int index = 0;
        for (index = currentSize - 1; index >= 0; index--) {
            if (value > data[index]) {
                data[index + 1] = data[index];
            }
            else {
                break;
            }

        }

        data[index + 1] = value;
        currentSize++;
    }

    @Override
    public int remove() {
        return data[--currentSize];
    }

    @Override
    public int peek() {
        return data[currentSize - 1];
    }
}
