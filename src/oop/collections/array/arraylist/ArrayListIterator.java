package oop.collections.array.arraylist;

public class ArrayListIterator{
    private Node actual;

    public LinkedListIterator(Node head){
        this.actual = head;
    }
    public boolean hasNext(){
        return actual != null;
    }
    public String next(){
        if(this.hasNext()){
            String data = actual.getData();
            actual = actual.getNext();
            return data;
        }else{
            throw new RuntimeException("Is not a valid operation: NULL");
        }
    }
}