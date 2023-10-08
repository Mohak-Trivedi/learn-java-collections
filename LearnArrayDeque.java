// Array Deque = 2-sided Queue
// Useful in Sliding Window problems.
// ArrayDeque class implements Queue interface. So, all Queue methods are available here.

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        ///////////////////////
        // Insertion: O(1)

        // offer(element) inserts element at the rear of the Queue, returns true if
        // successfully added else false.
        adq.offer(23);
        // alternative: add(element), but Throws Exception if unable to add

        // offerFirst(element) inserts element at the front of the Queue, returns true
        // if
        // successfully added else false.
        adq.offerFirst(12);

        // offerLast(element): exactly same as offer.
        adq.offerLast(45);

        adq.offer(26);

        System.out.println(adq);
        ///////////////////////

        ///////////////////////
        // VIEW the front element of Queue: O(1)

        // peek() returns the element present at the front of the Queue.
        System.out.println(adq.peek());
        // alternative: element(), but Throws Exception if Queue empty.

        // peekFirst(): Exactly same as peek()
        System.out.println(adq.peekFirst());

        // peekLast(): peek the rear of queue instead of the front.
        System.out.println(adq.peekLast());
        ///////////////////////

        ///////////////////////
        // Removal: O(1)

        // poll() removes the element present at the front of the Queue, and returns it.
        System.out.println(adq.poll());
        // alternative: remove(), but Throws Exception if Queue empty.
        System.out.println(adq);

        // pollFirst() exactly same as poll()
        System.out.println(adq.pollFirst());
        System.out.println(adq);

        // pollLast() remove the element present at the rear of the Queue instead of the
        // front.
        System.out.println(adq.pollLast());
        System.out.println(adq);
        ///////////////////////
    }
}
