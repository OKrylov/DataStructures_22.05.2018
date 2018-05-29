public class StackImpl implements Stack {

    private int[] data;
    private int size;

    public StackImpl(int size) {
        this.data = new int[size];
    }

    @Override
    public void push(int value) {
        data[size++] = value;
    }

    @Override
    public int pop() {
        size--;
        return data[size];
    }

    @Override
    public int peek() {
        return data[size - 1];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size >= data.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
