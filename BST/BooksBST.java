import java.util.NoSuchElementException;

class Books implements Comparable<Books> {

    private String name;

    public Books(String name) {
        this.name = name;
    }

    // For Comparable interface
    @Override
    public int compareTo(Books aBook) {
        return name.compareTo(aBook.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(" + name + ")";
    }
}