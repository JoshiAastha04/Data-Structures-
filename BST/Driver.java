public class Driver {

    public static void main(String[] args) {
        Integer[] ISBNs = {25, 101, 10, 45, 90, 110, 13, 11, 40, 60, 99, 105, 235, 17, 20, 67, 175}; // keys

        Books b1 = new Books("bA");
        Books b2 = new Books("bB");
        Books b3 = new Books("bC");
        Books b4 = new Books("bD");
        Books b5 = new Books("bE");
        Books b6 = new Books("bF");

        BST<Integer, Books> bst = new BST<Integer, Books>();

        // Call insert for each Key/Value pair
        for (Integer key : ISBNs) {
            Books book = new Books("Book for Key " + key);
            bst.insert(key, book);
        }

        
        performOperations(bst);
    }

    public static void performOperations(BST<Integer, Books> bst) {
        // Call isEmpty
        System.out.println("Is BST empty? " + bst.isEmpty());

        // Call displayLevel(5)
        System.out.println("Nodes at level 5:");
        bst.displayLevel(5);

        // Call size
        System.out.println("Size of the BST: " + bst.size());

        // Call levels
        System.out.println("Levels of the BST: " + bst.levels());

        // Call isEmpty again
        System.out.println("Is BST empty? " + bst.isEmpty());

        // Call search(some key)
        Integer searchKey = 67;
        boolean keyFound = bst.search(searchKey);
        if (keyFound) {
            System.out.println("Key " + searchKey + " found");
        } else {
            System.out.println("Key " + searchKey + " not found");
        }

        // Call display
        System.out.println("Binary Search Tree:");
        bst.display();

        // Call delete(67)
        bst.delete(67);

        // Call size after deleting
        System.out.println("Size of the BST after deletion: " + bst.size());

        // Call levels after deleting
        System.out.println("Levels of the BST after deletion: " + bst.levels());

        // Call search(67) after deleting
        keyFound = bst.search(67);
        if (keyFound) {
            System.out.println("Key 67 found");
        } else {
            System.out.println("Key 67 not found");
        }

        // Call displayLevel(5) after delete
        System.out.println("Nodes at level 5 after deletion:");
        bst.displayLevel(5);
    }
}
