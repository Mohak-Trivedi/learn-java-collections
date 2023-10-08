// The LinkedList class implements both: 
// the List interface i.e. LinkedList has access to all methods defined in List
// the Queue interface i.e. LinkedList has access to all methods defined in Queue

// We've already learnt about the List interface in LearnArrayList.java, so covering LinkedList and Queue together as LearnLinkedListQueue.java

import java.util.*;

public class LearnLinkedListQueue {
    Queue<Integer> queue = new LinkedList<>();

    ///////////////////////
    // Insertion: O(1)

    // offer(element) inserts element at the rear of the Queue, returns true if successfully added else false.
    queue.offer(12);
    queue.offer(24);
    queue.offer(36);
    // alternative: add(element), but Throws Exception if unable to add

    System.out.println(queue);

    ///////////////////////

    ///////////////////////
    // Removal: O(1)

    // poll() removes the element present at the front of the Queue, and returns it.
    System.out.println(queue.poll());
    // alternative: remove(), but Throws Exception if Queue empty.

    System.out.println(queue);

    ///////////////////////

    ///////////////////////
    // VIEW the front element of Queue: O(1)

    // peek() returns the element present at the front of the Queue.
    System.out.println(queue.peek());
    // alternative: element(), but Throws Exception if Queue empty.

    ///////////////////////
}
