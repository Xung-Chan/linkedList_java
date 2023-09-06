public interface ListInterface<T> {
    public boolean isEmpty();
    public int size();
    public T getFirst();
    public boolean contains(T item);
    public void addFirst(T item);
    public T removeFirst();
    public void print();
}
