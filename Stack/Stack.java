public class Stack<T> implements StackInterface<T> {
    private Node<T> top; // Reference to the top node of the stack
    private int size;   // Size of the stack

    // Constructor to initialize an empty stack
    public Stack() {
        top = null;
        size = 0;
    }

    // O(1)
    @Override
    public void push(T input) {
        // Create a new node with the input data and set its next to the current top
        Node<T> newNode = new Node<>(input);
        newNode.setNext(top);

        // Update the top to the new node
        top = newNode;

        // Increment the size
        size++;
    }

    // O(1)
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        // Get the data from the current top node
        T itemToReturn = top.getData();

        // Move the top to the next node (removing the current top)
        top = top.getNext();

        // Decrement the size
        size--;

        return itemToReturn;
    }

    // O(1)
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return top.getData();
    }

    // O(1)
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // O(1)
    @Override
    public int size() {
        return size;
    }
}
