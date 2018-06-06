package linkedlist;

import java.util.Iterator;

public interface LinkedList extends Iterable<Person> {

    void insert(Person data);

    Person delete();

    boolean delete(Person value);

    void display();

    boolean isEmpty();

    boolean contains(Person value);

    Person getFirst();

    int getSize();

    Iterator<Person> iterator();

}
