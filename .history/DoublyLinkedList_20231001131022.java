import java.util.Iterator;

import org.w3c.dom.Node;
@SuppressWarnings("unchecked")

public class DoublyLinkedList <T> implements Iterable <T>{
    private int size = 0;
    private Node <T> head = null;
    private Node <T> tail = null;

    // Internal node class to represent data
    private static class Node<T> {
        private T data;
        private Node<T> prev, next;

        public Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
        }

        @Override
        public String toString() {
        return data.toString();
        }
    }

    public void clear(){
        Node <T> trav = head;
        while (trav != null) {
            Node <T> next = trav.next;
            trav.prev = trav.next = null;
            trav.data = null;
            trav = next;
        }
        head = tail = trav = null;
        size = 0;
    }








    // Return the size of this linked list
    public int size() {
        return size;
    }

    // Is this linked list empty?
    public boolean isEmpty() {
        return size() == 0;
    }

    // Add an element to the tail of the linked list, O(1)
    public void add(T elem) {
        addLast(elem);
    }

    public void addLast(T elem) {
        if (isEmpty()){

        }
        else{
            tail.next = new Node<T>(elem, tail, null);;
            tail = tail.next;
        }
        size ++;
    }

      // Add a node to the tail of the linked list, O(1)
  public void addLast(T elem) {
    if (isEmpty()) {
      head = tail = new Node<T>(elem, null, null);
    } else {
      tail.next = new Node<T>(elem, tail, null);
      tail = tail.next;
    }
    size++;
  }

  // Add an element to the beginning of this linked list, O(1)
  public void addFirst(T elem) {
    if (isEmpty()) {
      head = tail = new Node<T>(elem, null, null);
    } else {
      head.prev = new Node<T>(elem, null, head);
      head = head.prev;
    }
    size++;
  }




    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
}