/*
 * < T > convention, stands for "Type", and it refers to the concept of Generics in Java
 */

public class Array <T> implements Iterable <T> {
    private T [] arr; //Static array
    private int length = 0;
    private int capacity = 0;


    public Array() { this(16); }

    public Array(int capacity) {
        if (capacity <0) throw new IllegalArgumentException("Illegal capacity: " + capacity);
        this.arr = new Array [16];
    }

}