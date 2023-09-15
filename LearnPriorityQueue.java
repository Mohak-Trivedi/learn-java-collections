import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // Same as Queue, but with Priority. In this case, Priority as per reverse
        // (descending) order.
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        ////////////////////////////
        // Insertion: O(1)
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        ////////////////////////////

        ////////////////////////////
        // Removal: O(1)
        pq.poll();
        System.out.println(pq);
        ////////////////////////////

        ////////////////////////////
        // View the front: O(1)
        System.out.println(pq.peek());
        ////////////////////////////
    }
}
