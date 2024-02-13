class BST<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {
        private final Key key;      // sorted by key
        private Value val;          // associated data 
        private Node left;          // left subtree
        private Node right;         // right subtree
        private int size;           // no. of nodes in a subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }   
    
    public void insert(Key key, Value val){
        if (key == null) {
            System.out.println("key is null!");
            return;
        }
        
        root = insert(root, key, val);
    }
    
    private Node insert(Node n, Key key, Value val){
        if (n == null){ //'simple' aka 'base' case
           return new Node(key, val, 1);
        }

        int cmp = key.compareTo(n.key); // Compare with n.key instead of n.keys
        if (cmp < 0){
           n.left = insert(n.left, key, val);
        } else if (cmp > 0){
           n.right = insert(n.right, key, val);
        } else { 
            n.val = val; // if identical, overwrite val
        }
        
        n.size = 1 + size(n.left) + size(n.right);
        return n;
    }
        
    public int size() {
        return size(root);
    }

    private int size(Node n) { 
        if (n == null){
             return 0;
        }
        return n.size;
    }
                
    public void delete(Key key){ 
        if(key == null){
           System.out.println("Key is null, unable to delete!");
           return;
        }
        root = delete(root, key);
    }
    
    private Node delete(Node n, Key key) {
        if(n == null){
             return null;
        }
      
        int cmp = key.compareTo(n.key);
        if (cmp < 0){
           n.left = delete(n.left, key);
        } else if (cmp > 0){
           n.right = delete(n.right, key);
        } else { // if identical, delete the node.
        
            if(n.right == null){
               return n.left;
            }
            if(n.left == null){
                return n.right;
            }
            
            Node tmp = n;
            n = min(tmp.right);
            n.right = deleteMin(tmp.right);
            n.left = tmp.left;     
        }
        
        n.size = 1 + size(n.left) + size(n.right);
        return n;
    }
    
    // return "smallest" key in the sub-tree
    private Node min(Node n){
        if(n.left == null){
            return n;
        } else {
            return min(n.left); // recursive call
        }
    }
    
    private Node deleteMin(Node n){
        if (n.left == null){
            return n.right;
        }
        n.left = deleteMin(n.left); // recursive call
        
        n.size = 1 + size(n.left) + size(n.right);
        return n;
    }
    
    public boolean search(Key key) {
        return search(root, key); 
    }
    
    private boolean search(Node n, Key key){
        if (n == null){
            return false;
        }
        
        int cmp = key.compareTo(n.key);
        if (cmp < 0){
            return search(n.left, key);
        } else if (cmp > 0){
            return search(n.right, key);
        } else {
            return true; // key matched
        }
    }

    public boolean isEmpty() {
        return size(root) == 0; // Check if size is equal to 0
    }
  
    public int levels(){
        return levels(root);
    }
    
    private int levels(Node n) {
        if (n == null){
            return 0; 
        }
        
        int left = levels(n.left);
        int right = levels(n.right);
        
        if (left < right){
            return right + 1;
        } else {
            return left + 1;
        }
    }
    
    public void display() {
        display(root);
        System.out.println();
    }

    private void display(Node n) {
        if (n != null) {
            display(n.left);
            System.out.print("(" + n.key + ", " + n.val + ") ");
            display(n.right);
        }
    }

    public void displayLevel(int level) {
        displayLevel(root, level, 1);
        System.out.println();
    }

    private void displayLevel(Node n, int targetLevel, int currentLevel) {
        if (n != null) {
            if (currentLevel == targetLevel) {
                System.out.print("(" + n.key + ", " + n.val + ") ");
            } else {
                displayLevel(n.left, targetLevel, currentLevel + 1);
                displayLevel(n.right, targetLevel, currentLevel + 1);
            }
        }
    }

    }