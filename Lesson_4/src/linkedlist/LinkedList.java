package linkedlist;

public interface LinkedList {

    void insert(Person data);

    Person delete();

    boolean delete(Person value);

    void display();

    boolean isEmpty();

    boolean contains(Person value);

    Person getFirst();

    int getSize();

    LinkIterator iterator();

}
