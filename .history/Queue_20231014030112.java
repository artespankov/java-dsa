public class Queue <T> implements Iterable <T>{
    private java.util.LinkedList <T> list= new java.util.LinkedList <T>();

public Queue(){ }

public Queue(T firstElem){
    offer(firstElem);
}


public offer(T elem){
    list.addLast(elem);
}


public int size(){
    return list.size();
}

}