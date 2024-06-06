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
            head = tail = new Node<T>(elem, null, null);
        }
        else{
            tail.next = new Node<T>(elem, tail, null);;
            tail = tail.next;
        }
        size ++;
    }


    // Add an element to the beginning of this linked list, O(1)
    public void addFirst(T elem) {
        if (isEmpty()){
            head = tail = new Node<T>(elem, null, head);

        }
    }

     // Add an element at a specified index
  public void addAt(int index, T data) throws Exception {
  }

  // Check the value of the first node if it exists, O(1)
  public T peekFirst() {
  }

  // Check the value of the last node if it exists, O(1)
  public T peekLast() {
  }

  // Remove the first value at the head of the linked list, O(1)
  public T removeFirst() {
    
  }

  // Remove the last value at the tail of the linked list, O(1)
  public T removeLast() {
    
  }

  // Remove an arbitrary node from the linked list, O(1)
  private T remove(Node<T> node) {
    
  }

  // Remove a node at a particular index, O(n)
  public T removeAt(int index) {
    
  }

  // Remove a particular value in the linked list, O(n)
  public boolean remove(Object obj) {
    
  }

  // Find the index of a particular value in the linked list, O(n)
  public int indexOf(Object obj) {
    
  }

  // Check is a value is contained within the linked list
  public boolean contains(Object obj) {

  }




  @Override
  public java.util.Iterator<T> iterator() {
    return new java.util.Iterator<T>() {
      private Node<T> trav = head;

      @Override
      public boolean hasNext() {
        return trav != null;
      }

      @Override
      public T next() {
        T data = trav.data;
        trav = trav.next;
        return data;
      }

      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[ ");
    Node<T> trav = head;
    while (trav != null) {
      sb.append(trav.data);
      if (trav.next != null) {
        sb.append(", ");
      }
      trav = trav.next;
    }
    sb.append(" ]");
    return sb.toString();
  }
    
}