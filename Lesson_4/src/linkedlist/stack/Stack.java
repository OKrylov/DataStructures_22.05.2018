package linkedlist.stack;

import linkedlist.Person;

public interface Stack {

    void push(Person value);

    Person pop();

    Person peek();

    int getSize();

    boolean isFull();

    boolean isEmpty();

    void display();

}
