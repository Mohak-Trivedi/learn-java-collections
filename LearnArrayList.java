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
        // Adding elements in the List:

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
        // Removal:

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

        ///////////////////////////////

    }
}