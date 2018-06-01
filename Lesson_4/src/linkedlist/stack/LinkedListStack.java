package linkedlist.stack;

import linkedlist.LinkedList;
import linkedlist.LinkedListImpl;
import linkedlist.Person;

public class LinkedListStack implements Stack {

    private final LinkedList data;

    public LinkedListStack() {
        data = new LinkedListImpl();
    }

    @Override
    public void push(Person value) {
        data.insert(value);
    }

    @Override
    public Person pop() {
        return data.delete();
    }

    @Override
    public Person peek() {
        return data.getFirst();
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void display() {
        data.display();
    }
}
