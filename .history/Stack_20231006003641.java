public class Stack <T> implements Iterable<T>{

    // Could be replaced with own implementation of LinkedList
    private java.util.LinkedList <T> list = new java.util.LinkedList <T>();

    public Stack () { }

    public Stack (T firstElem) {
        push(firstElem);
    }

    
}
