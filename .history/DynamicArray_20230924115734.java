/*
 * < T > convention, stands for "Type", and it refers to the concept of Generics in Java
 */

public class Array <T> implements Iterable <T> {
    private T [] arr; //Static array
    private int len = 0;
    private int capacity = 0;


    public Array() { this(16); }

    public Array(int capacity) {
        if (capacity <0) throw new IllegalArgumentException("Illegal capacity: " + capacity);
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    public int size(){ return len;}
    public boolean isEmpty(){ return size() == 0;}

    public T get(int index){ return arr[index];}
}