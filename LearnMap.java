import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        /////////////////////////
        // Insertion: O(1)

        // put(key, value)
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        // numbers.put("Two", 23); // Keys are unique so for the same key the value will
        // be updated.

        System.out.println(numbers);
        /////////////////////////

        /////////////////////////
        // Check if a particular element is present in the HashMap

        // containsKey(element): Just check Key is present or not
        if (!numbers.containsKey("Two")) {
            numbers.put("Two", 23);
        }

        System.out.println(numbers);

        // containsKey(element): Just check Value is present or not
        if (!numbers.containsValue(7)) {
            numbers.put("Seven", 7);
        }

        System.out.println(numbers);
        /////////////////////////

        /////////////////////////
        // Check if a HashMap is empty or not.

        // isEmpty()
        if (numbers.isEmpty()) {
            System.out.println("HashMap is empty.");
        }
        /////////////////////////

        /////////////////////////
        // Insert a key-value pair only if the key is not already present.

        // putIfAbsent("Key", value)
        numbers.putIfAbsent("Two", 23);
        /////////////////////////

        /////////////////////////
        // Iterating over the entire HashMap

        // entrySet() returns set of key-value pairs stored as Entry.
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e); // To get the current entry (pair)
            System.out.println(e.getKey()); // To get just the key
            System.out.println(e.getValue()); // To get just the value
        }

        // keySet() returns set of keys
        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        // values() returns just the set of values
        for (Integer num : numbers.values()) {
            System.out.println(num);
        }
        /////////////////////////

        /////////////////////////
        // Empty the HashMap

        // clear()
        numbers.clear();
        System.out.println(numbers);
        /////////////////////////
    }
}
