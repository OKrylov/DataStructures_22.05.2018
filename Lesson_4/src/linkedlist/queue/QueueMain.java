package linkedlist.queue;

import linkedlist.Person;
import linkedlist.stack.LinkedListStack;
import linkedlist.stack.Stack;

public class QueueMain {

    public static void main(String[] args) {
        Queue st = new LinkedListQueue();
        st.insert(new Person(7, "Anna7"));
        st.insert(new Person(8, "Anna8"));
        st.insert(new Person(9, "Anna9"));

//        st.display();

        while ( !st.isEmpty()) {
            System.out.println(st.remove());
        }

        System.out.println("Stack size = " + st.getSize());
    }
}
