// HashSet, LinkedHashSet, TreeSet all these follow one main property of Set i.e. only unique elements can be present, no duplicate elements at all.

import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
        // For HashSet:
        Set<Integer> set = new HashSet<>();

        // For LinkedHashSet:
        // Set<Integer> set = new LinkedHashSet<>();
        // exactly same as HashSet, but it is linked i.e. the order won't be random. The
        // elements will be present in the set in the same order in which you had
        // inserted them in the set.
        // The syntax remains the same.

        // For TreeSet:
        // Set<Integer> set = new TreeSet<>();
        // Exactly same as HashSet, but instead of random order, the elements are stored
        // in sorted order. This is because it internally uses a BST i.e. a Binary
        // Search Tree.
        // The syntax remains the same.

        ///////////////////////////
        // Insertion: O(1). For TreeSet O(logn) because it internally uses a BST: Binary
        /////////////////////////// Search Tree

        // add(element) inserts the element in HashSet as per the Hash value generated
        // due to Hashing.
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        // Duplicate elements won't get added as it is a set.
        // set.add(21);
        // set.add(32);

        System.out.println(set); // The order of elements is not the same as how we inserted them into the
                                 // HashSet, also each time you run the program, you'll get a different order.
                                 // This is because of Hashing.
        ///////////////////////////

        ///////////////////////////
        // Removal: O(1). For TreeSet O(logn)

        // remove(element)
        set.remove(54);

        System.out.println(set);
        ///////////////////////////

        ///////////////////////////
        // Check if a particular element is present in the set: O(1). For TreeSet
        // O(logn).

        // contains(element) returns true if element is present in set, else false.
        System.out.println(set.contains(21));
        ///////////////////////////

        ///////////////////////////
        // Check if set is empty. O(1)

        // isEmpty() returns true if set is empty, else false.
        System.out.println(set.isEmpty());
        ///////////////////////////

        ///////////////////////////
        // Number of elements in set. O(1)

        // size() returns number of elements present in the set.
        System.out.println(set.size());
        ///////////////////////////

        ///////////////////////////
        // Remove all the elements from the set. O(1)

        // clear()
        set.clear();
        System.out.println(set);
        ///////////////////////////

        ///////////////////////////
        // Sets of Custom Classes:

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Mohak", 7));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));
        // We can also create HashSet of custom classes(in our case, Student), not just
        // Integer, String, etc.
        // But, for that, we need to define our own hashCode() and equals(). Check
        // Student.java file.
        // Without defining these, Set allows us to insert objects with same values i.e.
        // duplicates, which is against the main principle of
        // Set. Example:
        // studentSet.add(new Student("Mohak", 7)); // uncomment this, comment
        // hashCode() and equals()
        // System.out.println(studentSet);
        // This happens because, Set just sees object reference, which will be different
        // even for duplicate objects as we use the new
        // keyword.
        // Hence, hashCode() to indicate set to generate Hash on a particular property
        // (rollNo, in our case) instead of object reference;
        // and equals() to indicate set to compare on the basis of a particular property
        // (rollNo, in our case) instead of object reference.
        // studentSet.add(new Student("Mohak", 7)); // uncomment this, uncomment
        // hashCode() and equals()
        // System.out.println(studentSet);
        ///////////////////////////
    }
}
