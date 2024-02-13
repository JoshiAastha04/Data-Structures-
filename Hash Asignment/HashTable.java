class HashTable<Key, Value> implements HashTableInterface<Key, Value> {
	
	private HashItem[] hashTable;
	private int pairs; // number of items (key/value pairs) currenlty stored in the hash table
	private int size;  // table size (aka array size)
	
	private static class HashItem {
		public final Object key;
		public Object val;
		
		public HashItem(Object key, Object val) {
			this.key = key;
			this.val = val;
		}		
	}
	
	public HashTable(int size) {
		hashTable = new HashItem[size];
		this.size = size;		
	}
	
	private int hash(Key k) {
		return (k.hashCode() & 0x7fffffff) % size;
	}

	public void put(Key k, Value v) {
		if(k == null || v == null) {
			System.out.println("key or value null, unable to insert item.");
			return;
		}
					
		// generate index using hash function
		int index = hash(k);
		
		// if collision occured, nothing we can do
		if(hashTable[index] != null) {
			// Collision!!
			System.out.println("Collision occurred, unable to insert. Try a different key.");
			// the other option is to "overwrite" the value
			// hashTable[index].val = v;
			// return;
		}
		// else if there is room, add item
		else if(pairs != size) {
			//HashItem item = new HashItem(k,v); // longer way is to create a item variable and assign hashTable[index] to item.
			hashTable[index] = new HashItem(k,v);
			pairs++;
		}
		// else table is full
		else {
			System.out.println("Table is full.");
		}
	}
	
	public void remove(Key k) {
		if(k == null){
            System.out.println("Key is null, unable to remove.");
            return;
        }
        int index = hash(k);

        if (hashTable[index] != null && hashTable[index].key.equals(k)){
            hashTable[index] = null;
            pairs --;
            System.out.println("Item removed successfully.");
        } 
        else {
            System.out.println("Remove failed! unable to find key.");
        }

    }
	
	public Value get(Key k) {
		if(k == null) {
			System.out.println("Key is null, unable to get.");
			return null;
		}
		
		if(pairs == 0) {
			System.out.println("Table is empty.");
			return null;
		}
		
		// generate index using hash function
		int index = hash(k);
		
		if(hashTable[index] != null && hashTable[index].key.equals(k)) {
			return (Value) hashTable[index].val;
		}
		
		System.out.println("get failed! Unable to find key.");
		return null;
	}
	
	public boolean contains(Key k) {
        if (k == null){
            System.out.println("Key is null, unable to check containment.");
            return false;
        
        }

        int index = hash(k);
        
         return (hashTable[index] != null && hashTable[index].key.equals(k));
	}
	
	public boolean isEmpty() {
		return pairs == 0;
	}
	
	public int size() {
		// return the number of items (key/value pairs) currenlty stored in the hash table
		return pairs;
	}

}