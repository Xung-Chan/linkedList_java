class Node<T>{
    private T value;
    private Node<T> next=null;
    public Node(T value,Node<T> next){
        this.value = value;
        this.next = next;
    }
    public T getValue(){    
        return value;
    }
    public Node<T> getNext(){
        return next;
    }
    public void setNext(Node<T> list){
        next=list;
    }
}