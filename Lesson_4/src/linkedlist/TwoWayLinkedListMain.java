package linkedlist;

public class TwoWayLinkedListMain {

    public static void main(String[] args) {
        TwoWayLinkedList linkedList = new TwoWayLinkedList();
        Person anna = new Person(7, "Anna");
        Person pavel = new Person(15, "Pavel");
        Person oleg = new Person(10, "Oleg");
        Person sveta = new Person(25, "Sveta");

        linkedList.insert(anna);
        linkedList.insert(pavel);
        linkedList.insert(oleg);

//        linkedList.delete(oleg);
//        linkedList.delete();

        linkedList.insertLast(sveta);

        while ( !linkedList.isEmpty() )
            System.out.println(linkedList.delete());

//        System.out.println("Contains Anna: " + linkedList.contains(anna));
        linkedList.display();
    }
}
