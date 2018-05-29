import java.util.Objects;

public class OrderedArrayImpl<E extends Object & Comparable> extends ArrayImpl<E> {

    public OrderedArrayImpl(int size) {
        super(size);
    }

    private OrderedArrayImpl(E[] data, int size) {
        super(data, size);
    }

    @Override
    public void insert(E value) {
        int index;
        for (index = 0; index < size; index++) {
            if (get(index).compareTo(value) > 0)
                break;
        }
        if (index == size) {
            array[size++] = value;
            return;
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = value;
        size++;
    }

    @Override
    public int indexOf(E value) {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Objects.equals(get(mid), value)) {
                return mid;
            }
            if (value.compareTo(array[mid]) < 0) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    @Override
    public Array<E> copy() {
        return new OrderedArrayImpl<>(array, size);
    }
}
