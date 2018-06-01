package linkedlist.stack;

import linkedlist.Person;

public class StackMain {

    public static void main(String[] args) {
        Stack st = new LinkedListStack();
        st.push(new Person(7, "Anna7"));
        st.push(new Person(8, "Anna8"));
        st.push(new Person(9, "Anna9"));

//        st.display();

        while ( !st.isEmpty()) {
            System.out.println(st.pop());
        }

        System.out.println("Stack size = " + st.getSize());
    }
}
