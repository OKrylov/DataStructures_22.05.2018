package linkedlist;

import java.util.Iterator;

public class LinkIterator implements Iterator<Node> {

    private LinkedList linkedList;
    private Node current;

    public LinkIterator(LinkedList linkedList, Node current) {
        this.linkedList = linkedList;
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current.getNextNode() != null;
    }

    @Override
    public Node next() {
        return current = current.getNextNode();
    }

    @Override
    public void remove() {
        linkedList.delete(current.getData());
    }
}
