public class Stack <T> implements Iterable<T>{

    // Could be replaced with own implementation of LinkedList
    private java.util.LinkedList <T> list = new java.util.LinkedList <T>();

    // create empty Stack
    public Stack () { }

    // or create Stack with one initial element
    public Stack (T firstElem) {
        push(firstElem);
    }

    // return number lements in Stack
    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    // push an element on the stack
    public void push(T elem){
        list.addLast(elem);
    }


    // pop an element off the stack
    // throws an error if the stack is empty
    // the end should be the same as for push - Last
    public T pop(){
        if (isEmpty()) throw new java.util.EmptyStackException();
        return list.removeLast();
    }

    // the end should be the same as for push/pop - Last
    public T peek(){
        if (isEmpty()) throw new java.util.EmptyStackException();
        return list.peekLast();
    }

    @Override public java.util.Iterator <T> iterator (){
        return list.
    }


    
}
