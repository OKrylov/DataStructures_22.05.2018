package linkedlist;

import java.util.Iterator;

public class MainDZ {

    public static void main(String[] args) {
        LinkedList list = new LinkedListImpl();
        list.insert(new Person(25, "Oleg"));
        list.insert(new Person(25, "Irina"));
        list.insert(new Person(18, "Lubov"));

        for (Person p : list) {
            System.out.println(p);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("After delete");
        list.display();

    }
}
