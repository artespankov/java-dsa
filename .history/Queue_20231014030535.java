import javax.management.RuntimeErrorException;

public class Queue <T> implements Iterable <T>{
    private java.util.LinkedList <T> list= new java.util.LinkedList <T>();

public Queue(){ }

public Queue(T firstElem){
    offer(firstElem);
}


public void offer(T elem){
    list.addLast(elem);
}


public int size(){
    return list.size();
}

public boolean isEmpty(){
    return size() == 0;
}


public T peek(){
    if (isEmpty()){
        throw new RuntimeException("List is empty");
    }
    return list.peekFirst();
}


public T poll(){
    if (isEmpty()){
        throw new RuntimeException("List is empty");
    }
    return list.p();
}

}