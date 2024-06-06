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

    public boolean empty(){

    }

    
}
