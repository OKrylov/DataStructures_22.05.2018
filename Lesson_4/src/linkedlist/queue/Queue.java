package linkedlist.queue;

import linkedlist.Person;

public interface Queue {

    boolean isEmpty();

    boolean isFull();

    int getSize();

    void insert(Person value);

    Person remove();

    Person peek();
}
