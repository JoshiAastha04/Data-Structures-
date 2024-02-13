import java.util.HashMap;

public class HashDriver {
    public static void main(String[] args) {
        HashMap<String, Integer> keyValueTable = new HashMap<>();

        // Size and isEmpty
        System.out.println("Size: " + keyValueTable.size());
        System.out.println("Is Empty: " + keyValueTable.isEmpty());

        // Remove non-existing key
        keyValueTable.remove("nonExistingKey1");
        keyValueTable.remove("nonExistingKey2");

        // non-existing key
        System.out.println("Value for nonExistingKey3: " + keyValueTable.get("nonExistingKey3"));

        // new key/value
        keyValueTable.put("key1", 5);
        keyValueTable.put("key2", 10);

        // Size, isEmpty
        System.out.println("Size: " + keyValueTable.size());
        System.out.println("Is Empty: " + keyValueTable.isEmpty());

        // non-existing key
        System.out.println("Value for nonExistingKey4: " + keyValueTable.get("nonExistingKey4"));

        // existing key
        System.out.println("Value for key1: " + keyValueTable.get("key1"));
        System.out.println("Value for key2: " + keyValueTable.get("key2"));

        // some other new key values
        keyValueTable.put("key3", 15);
        keyValueTable.put("key4", 20);
        keyValueTable.put("key5", 25);
        keyValueTable.put("key6", 30);

        // Size
        System.out.println("Size: " + keyValueTable.size());

        // Remove  key
        keyValueTable.remove("key1");

        // Size
        System.out.println("Size: " + keyValueTable.size());

        // Remove another key
        keyValueTable.remove("key2");

        // Size
        System.out.println("Size: " + keyValueTable.size());

        // Remove non-existing key
        keyValueTable.remove("nonExistingKey5");

        // Remove all keys
        keyValueTable.clear();

        // Size and isEmpty
        System.out.println("Size: " + keyValueTable.size());
        System.out.println("Is Empty: " + keyValueTable.isEmpty());
    }
}

