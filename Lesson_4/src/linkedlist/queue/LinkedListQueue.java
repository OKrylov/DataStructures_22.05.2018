package linkedlist.queue;

import linkedlist.Person;
import linkedlist.TwoWayLinkedList;

public class LinkedListQueue implements Queue {

    private final TwoWayLinkedList data;

    public LinkedListQueue() {
        this.data = new TwoWayLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

    @Override
    public void insert(Person value) {
        data.insertLast(value);
    }

    @Override
    public Person remove() {
        return data.delete();
    }

    @Override
    public Person peek() {
        return data.getFirst();
    }
}
