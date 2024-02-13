public interface HeapInterface<Key, Value> {

	public  void     insert(Key k, Value v);
	public  HeapItem deleteRoot(); 
   public  void     fixDown(int idx, int upTo); 
	public  void     fixUp(int idx); 
	public  boolean  isFull();
	public  void     heapSort();
	public  void     heapify(HeapItem[] arr);

}