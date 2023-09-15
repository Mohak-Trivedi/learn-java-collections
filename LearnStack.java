import java.util.*;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        /////////////////////////////
        // Insertion: O(1)

        // push(element) inserts element at top of Stack.
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Horse");
        animals.push("Dog");

        System.out.println("Stack: " + animals);

        /////////////////////////////

        /////////////////////////////
        // View: O(1)

        // peek() returns the element at the top of Stack, does not remove it.
        System.out.println("Top of stack: " + animals.peek()); // VIEW the element at top O(1)

        ////////////////////////////

        ////////////////////////////
        // Remove: O(1)

        // pop() removes the element present at the top of the Stack.
        animals.pop(); // REMOVE the element at top O(1)

        System.out.println("Stack: " + animals);

        System.out.println("Top of stack: " + animals.peek());

        ////////////////////////////
    }
}