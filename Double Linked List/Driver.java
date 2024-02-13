import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Driver {
    public static void main(String[] args) {
        // Declare/Initialize a Double Linked List
        List<String> doubleLinkedList = new LinkedList<>();

        // Print the initial state
        printList(doubleLinkedList);
        
        // Call insertStart and insert 5 Strings
        insertStart(doubleLinkedList, "hi there");
        insertStart(doubleLinkedList, "i'm a comp sci Student");
        insertStart(doubleLinkedList, "I'm in my Sophmore year");
        insertStart(doubleLinkedList, "I go to CSUN");
        insertStart(doubleLinkedList, "I miss Home");

        // Print the list after insertion
        printList(doubleLinkedList);
        
        // Check if the list is empty
        System.out.println("Is the list empty? " + doubleLinkedList.isEmpty());
        
        // Get the size of the list
        System.out.println("Size of the list: " + doubleLinkedList.size());

        // Insert a new String at a specific position
        insertAtPosition(doubleLinkedList, "i'm an international student", 2);

        // Print the list after insertion
        printList(doubleLinkedList);
        
        // Insert another String at a different position
        insertAtPosition(doubleLinkedList, "I'm taking 2 comp classes", 4);

        // Print the list after insertion
        printList(doubleLinkedList);
        
        // Insert a new String at the end
        insertEnd(doubleLinkedList, "Okay, bye");

        // Print the list after insertion
        printList(doubleLinkedList);
        
        // Get the updated size
        System.out.println("Size of the list: " + doubleLinkedList.size());

        // Remove at specific positions
        removeFromPosition(doubleLinkedList, 3);
        removeFromPosition(doubleLinkedList, 5);
        removeFromPosition(doubleLinkedList, 1);

        // Print the list after removal
        printList(doubleLinkedList);

        // Skipping next 3 calls (FALL 2022)

        // Declare and Initialize an iterator
        ListIterator<String> iterator = doubleLinkedList.listIterator();

        // Iterate and print nodes using next (4 times)
        for (int i = 0; i < 4; i++) {
            if (iterator.hasNext()) {
                System.out.println("Next: " + iterator.next());
            }
        }

        // Iterate and print nodes using prev (4 times)
        for (int i = 0; i < 4; i++) {
            if (iterator.hasPrevious()) {
                System.out.println("Previous: " + iterator.previous());
            }
        }
    }

    // Helper method to insert a new String at the start of the list
    private static void insertStart(List<String> list, String data) {
        list.add(0, data);
    }

    // Helper method to insert a new String at a specific position in the list
    private static void insertAtPosition(List<String> list, String data, int position) {
        list.add(position, data);
    }

    // Helper method to insert a new String at the end of the list
    private static void insertEnd(List<String> list, String data) {
        list.add(data);
    }

    // Helper method to remove an element from a specific position in the list
    private static void removeFromPosition(List<String> list, int position) {
        list.remove(position);
    }

    // Helper method to print the contents of the list
    private static void printList(List<String> list) {
        System.out.println("Current List: " + list);
    }
}