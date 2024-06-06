/*
 * < T > convention, stands for "Type", and it refers to the concept of Generics in Java
 */

public class DynamicArray <T> implements Iterable <T> {
    private T [] arr; //Static array
    private int len = 0;
    private int capacity = 0;


    public DynamicArray() { this(16); }

    public DynamicArray(int capacity) {
        if (capacity <0) throw new IllegalArgumentException("Illegal capacity: " + capacity);
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    public int size(){ return len; }
    public boolean isEmpty(){ return size() == 0; }

    public T get(int index){ return arr[index]; }
    public void set(int index, T element){ arr[index] = element; }

    public void clear(){
        for (int i=0; i < capacity; i++){
            
        }
    }



}