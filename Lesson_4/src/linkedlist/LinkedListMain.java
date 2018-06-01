package linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedListImpl();
        Person anna = new Person(7, "Anna");
        Person pavel = new Person(15, "Pavel");
        Person oleg = new Person(10, "Oleg");

        linkedList.insert(anna);
        linkedList.insert(pavel);
        linkedList.insert(oleg);

//        linkedList.delete(oleg);
//        linkedList.delete();

//        System.out.println("Contains Anna: " + linkedList.contains(anna));
        linkedList.display();

        LinkIterator iterator = linkedList.iterator();
        LinkIterator iterator2 = linkedList.iterator();

        System.out.println("Removing...");



//        while ( iterator.hasNext() ) {
//            iterator.remove();
//            iterator.next();
//        }
//
//        iterator.remove();

        System.out.println("After remove:");
        linkedList.display();
    }
}
