import java.util.Arrays; // useful only for primary arrays, not arraylists.

public class LearnArraysClass {
    public static void main(String[] args) {

        ///////////////////////////////////////
        // // Searching in a sorted array : O(logn)

        // int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // // binarySearch(array, key): returns index where key is found in array.
        // returns
        // // -1 if not found
        // int index = Arrays.binarySearch(numbers, 4);

        // System.out.println("The index of element 4 is " + index);
        ///////////////////////////////////////

        ///////////////////////////////////////
        // Sort: O(nlogn)
        Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79 };

        // sort(array)
        Arrays.sort(numbers);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        ///////////////////////////////////////

        ///////////////////////////////////////
        // Insertion: O(n)

        // fill(array, value): fills all indices of array with value as value.
        Arrays.fill(numbers, 12);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        ///////////////////////////////////////
    }
}
