public class Stack <T> implements Iterable<T>{

    // Could be replaced with own implementation of LinkedList
    private java.util.LinkedList <T> list = new java.util.LinkedList <T>();

    // create empty Stack
    public Stack () { }

    public Stack (T firstElem) {
        push(firstElem);
    }

    public int size(){
        return list.size();
    }

    
}
