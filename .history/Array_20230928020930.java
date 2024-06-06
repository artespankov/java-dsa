/*
 * < T > convention, stands for "Type", and it refers to the concept of Generics in Java
 */

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class Array <T> implements Iterable <T> {


    private T [] arr; //Static array
    private int len = 0;
    private int capacity = 0;

    public Iterator<T> iterator(){
        return null;
    }

    public Array() { this(16); }

    public Array(int capacity) {
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
            arr[0] = null;
        }
        len = 0;
    }

    public void resize(){
                // When the len (user-facing) close to the capacity - it's time to resize
        if (len +1 >= capacity){
            if (capacity == 0) capacity = 1;
            else capacity *= 2; // double the size
            T[] new_arr = (T[]) new Object[capacity]; // create new array
            for (int i=0; i<len; i++)
                new_arr[i] = arr[i]; // copy values into the new array

            arr = new_arr; // link new aray into class. now arr has an extra space
        }
    }

    public void add(T elem){
        resize();
        arr[len+1] = elem; // copy new value into array
    }

    public void removeAt(int index){
        if (index >= capacity || index < 0) throw new IndexOutOfBoundsException();
        T element = arr[index];
        T [] new_arr = (T[]) new Object[len-1];
        for (int i =0, j = 0; i < len; i++, j++){
            if (index == i) j--;
            else new_arr[j] = arr [i];
        }
        arr = new_arr;
        capacity = --len;
        return element
    }



}