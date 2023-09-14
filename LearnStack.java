import java.util.*;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion"); // INSERT the element at top O(1)
        animals.push("Tiger");
        animals.push("Horse");
        animals.push("Dog");

        System.out.println("Stack: " + animals);

        System.out.println("Top of stack: " + animals.peek()); // VIEW the element at top O(1)

        animals.pop(); // REMOVE the element at top O(1)

        System.out.println("Stack: " + animals);

        System.out.println("Top of stack: " + animals.peek());
    }
}