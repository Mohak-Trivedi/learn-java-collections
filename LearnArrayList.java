import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        /*
         * Array: Fixed size. Not scalable.
         * ArrayList: Dynamic size. Scalable.
         * 
         * Increases size from n to n + (n/2) + 1
         */

        List<Integer> list = new ArrayList<>();

        ////////////////////////////
        // Adding elements in the List: O(n)

        // add(element) adds element to the end of arraylist.
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);

        // add(index, element) method overriding adds element at index in arraylist.
        list.add(1, 50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        // addAll(newList) adds all elements from newList at the end of current
        // arraylist.
        list.addAll(newList);
        System.out.println(list);

        //////////////////////////////

        //////////////////////////////
        // Removal: O(n)

        // remove(index) removes element at index in arraylist.
        list.remove(1);
        System.out.println(list);

        // remove(Object) removes the mentioned object if it is of the same type as the
        // one stored in arraylist.
        list.remove(Integer.valueOf(150));
        System.out.println(list);

        // clear() removes all the elements from the list
        list.clear();
        System.out.println(list);

        ///////////////////////////////

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        ///////////////////////////////
        // Updating/Setting: O(1)

        // set(index, element) sets element at index in arraylist
        list.set(2, 373);
        System.out.println(list);

        //////////////////////////////

        //////////////////////////////
        // Check presence: O(n)

        // contains(element) returns true if element present in arraylist, else false.
        System.out.println(list.contains(200));
        System.out.println(list.contains(500));

        //////////////////////////////

        //////////////////////////////
        // Iteration

        // for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // for each loop: RECOMMENDED METHOD as it is convenient
        for (Integer element : list) {
            System.out.print(element);
        }
        System.out.println();

        // iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();
        //////////////////////////////
    }
}