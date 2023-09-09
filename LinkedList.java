import java.util.NoSuchElementException;

class LinkedList<T> implements ListInterface<T> {
    private Node<T> head=null;
    private int size=0;
    public LinkedList(){

    }
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public T getFirst() throws IndexOutOfBoundsException{
        if(size==0)
            throw new IndexOutOfBoundsException("List is empty");
        return head.getValue();
    }
        
    
    @Override
    public boolean contains(T item){
        Node<T> current=head;
        while(current!=null){
            if(current.getValue().equals(item))
                return true;
        }
        return false;
    }
    public C removeItem(T item) throws NoSuchElementException{
        if(head==null)
            throw new NoSuchElementException("Empty");
        else{
            Node<T> current=head;
            if(current.getValue().equals(item)){
                head=head.getNext();
                size--;
                return item;
            }
            Node<T> prev=current;
            while((current=current.getNext())!=null){
                if(current.getValue().equals(item)){
                    prev.setNext(current.getNext());
                    size--;
                    return item;
                }
                prev=current;
            }
            throw new NoSuchElementException("Not Found");
        }   
    }   
    @Override
    public T removeFirst() throws IndexOutOfBoundsException{
        if(size==0)
            throw new IndexOutOfBoundsException("List is empty");
        T tmp=head.getValue();
        head=head.getNext();
        return tmp; 
    }
    @Override
    public void addFirst(T item){
        Node<T> tmp=new Node<>(item,null);
        if(head==null){
            head=tmp;
            size++;
            return;
        }
        Node<T> current=head;
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(tmp);
        size++;
    }
    @Override
    public void print(){
        Node<T> current=head;
        while(current!=null){
            System.out.print(current.getValue()+" ");
            current=current.getNext();
        }
    }
}
