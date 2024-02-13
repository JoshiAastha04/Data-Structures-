public interface BSTInterface<Key, Value> {

	public boolean isEmpty();
	public int size();
	public boolean search(Key key);
	public void insert(Key key, Value val);
	public void delete(Key key);
	public int levels();
	public void display();
	public void displayLevel(int level);
}