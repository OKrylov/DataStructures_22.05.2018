public interface Array<E extends Comparable> {

    void display();

    void insert(E value);

    E get(int index);//[index]

    boolean contains(E value);

    int indexOf(E value);

    boolean delete(E value);

    boolean isFull();

    void sortBubble();

    void sortSelect();

    void sortInsert();

}
