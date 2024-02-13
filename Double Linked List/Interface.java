public interface Interface<T> {

    // O(1)
    void insertStart(T item);

    // O(n)
    void insertAtPos(T item, int pos);

    // O(1)
    void insertAtEnd(T item);

    // O(n)
    void removeAtPos(int pos);

    // O(1)
    int size();

    // O(1)
    boolean isEmpty();

    // O(n)
    void print();
}