class DoubleLinkedList<T> implements Interface<T> {

    // member/instance vars
    private Node<T> start;
    private Node<T> end;
    private int size;

    // O(1)
    public void insertStart(T item) {
        // create a new Node with item
        Node<T> newNode = new Node<T>(item);

        // if list is empty (brand new double linked list)
        if (start == null) {
            start = newNode;
            end = start;
        }
        // else list already contains nodes
        else {
            // 3 steps:
            start.setPrev(newNode); // step 1
            newNode.setNext(start); // step 2
            start = newNode; // step 3
        }

        size++;
    }

    // O(n)
    public void insertAtPos(T item, int pos) {
        // Creating a new node
        Node<T> newNode = new Node<T>(item);

        // If the list is empty or pos is 1, insert at the start
        if (start == null || pos == 1) {
            insertStart(item);
        }
        // If pos is the size+1, insert at the end
        else if (pos == size + 1) {
            insertAtEnd(item)
        }
        else if (pos > 1 && pos <= size) {
            Node<T> tmp = start.getNext();
            for (int i = 2; i < size; i++) {
                if (pos == i) {
                    Node<T> p = tmp.getPrev();
                    p.setNext(newNode);
                    newNode.setPrev(p);
                    newNode.setNext(tmp);
                    tmp.setPrev(newNode);
                    size++;
                }
                tmp = tmp.getNext();
            }
        }
    }

    // O(1)
    public void insertAtEnd(T item) {
        Node<T> newNode = new Node<T>(item);
        if (end == null) {
            start = newNode;
            end = newNode;
        } else {
            newNode.setPrev(end);
            end.setNext(newNode);
            end = newNode;
        }
        size++;
    }

    // O(n)
    public void removeAtPos(int pos) {
    }

    // O(1)
    public int size() {
        return size;
    }

    // O(1)
    public boolean isEmpty() {
        return size == 0;
    }

    // O(n)
    public void print() {
    }
}