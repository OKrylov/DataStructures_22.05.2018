package linkedlist;

public class TwoWayLinkedList extends LinkedListImpl {

    private Node lastElement;

    public void insertLast(Person value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            firstElement = newNode;
        }
        else {
            lastElement.setNextNode(newNode);
        }
        lastElement = newNode;
        currentSize++;
    }

    @Override
    public void insert(Person data) {
        boolean wasEmpty = isEmpty();
        super.insert(data);
        if ( wasEmpty ) {
            lastElement = firstElement;
        }
    }

    @Override
    public boolean delete(Person value) {
        boolean deleted = super.delete(value);
        if (isEmpty()) {
            lastElement = null;
        }
        return deleted;
    }

    public Person getLast() {
        return lastElement.getData();
    }

}
