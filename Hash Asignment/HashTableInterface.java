public interface HashTableInterface <Key, Value>{
     void put (Key k, Value v);
     void remove(Key k);
     Value get(Key k);
     boolean contains (Key k);
     boolean isEmpty();
     int size();
     int hash(Key k);
}