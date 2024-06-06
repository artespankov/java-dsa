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
            head = tail = new Node<T>(elem, null, null);
        }
        else{
            head.prev = new Node<T>(elem, null,  head);
            head = head.prev;
        }
        size ++;
    }


    // Add an element at a specified index

    if (index == size) {
      addLast(data);
      return;
    }

    Node<T> temp = head;
    for (int i = 0; i < index - 1; i++) {
      temp = temp.next;
    }
    Node<T> newNode = new Node<>(data, temp, temp.next);
    temp.next.prev = newNode;
    temp.next = newNode;

    size++;
  }

     // Add an element at a specified index
  public void addAt(int index, T data) throws Exception {
    if (index < 0 || index >= size){
      throw new Exception("Illegal index");
    }
    if (index == 0) {
      addFirst(data);
      return;
    }

    if (index == size - 1){
      addLast(data);
      return;
    }

    Node <T> temp = head;

    for (int i =0; i < index - 1; i++) {
      
    }

    
  }

  // Check the value of the first node if it exists, O(1)
  public T peekFirst() {
    if (isEmpty()) throw new RuntimeException("Empty List");
    return head.data;
  }

  // Check the value of the last node if it exists, O(1)
  public T peekLast() {
    if (isEmpty()) throw new RuntimeException("Empty List");
    return tail.data;
  }

  // Remove the first value at the head of the linked list, O(1)
  public T removeFirst() {
    // Can't remove from empty list
    if (isEmpty()) throw new RuntimeException("Empty List");

    // Extract the data at head pointer and move it by one
    T data = head.data;
    head = head.next;
    size--;

    // if list is empty after removal - set the tail to null as well 
    if (isEmpty()) tail = null;

    // Do a memory clean of the prev head
    else head.prev = null;
    
    // remove the data that was at the former head we just removed
    return data;
    
  }

  // Remove the last value at the tail of the linked list, O(1)
  public T removeLast() {
    if (isEmpty()) throw new RuntimeException("Can't remove last from empty List");

    // save the data from tail, reset the tail to it's previous node
    T data = tail.data;
    tail = tail.prev;
  --size;

    // if list is empty - set the head to null as well
    if (isEmpty()) head = null;

    // cleanup memory - remove the reference from the new tail to previous one
    else tail.next = null;

    return data;
    
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