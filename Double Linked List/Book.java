class Book implements Comparable<Book> {

	private String name;
	private int ISBN;
	
	public Book(String name, int ISBN) {
		this.name = name;
		this.ISBN = ISBN;
	}
	
	// for Comparable interface
	@Override
	public int compareTo(Book aBook) {
		if(ISBN > aBook.getISBN()) {
			return 1;
		}
		else if(ISBN < aBook.getISBN()) {
			return -1;
		}
		return 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getISBN() {
		return ISBN;
	}
	
	public String toString() {
		return "(" + name + "," + ISBN + ")";
	}

}