// When you want some more features apart from the ones provided in the Collections Framework.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        /////////////////////////////////////
        // Find min: O(n)

        // min(collection)
        System.out.println("Min element: " + Collections.min(list));
        /////////////////////////////////////

        /////////////////////////////////////
        // Find max: O(n)

        // max(collection)
        System.out.println("Max element: " + Collections.max(list));
        /////////////////////////////////////

        /////////////////////////////////////
        // Get frequency of an element: O(n)

        // frequency(collection, element)
        System.out.println(Collections.frequency(list, 9));
        /////////////////////////////////////

        /////////////////////////////////////
        // Sort: O(nlogn)

        // sort(collection)
        Collections.sort(list);
        System.out.println(list);

        // use Comparator for custom sort fashion or custom sort criteria
        Collections.sort(list, Comparator.reverseOrder()); // in this case, descending order
        System.out.println(list);

        // Sorting our own class, based on its particular properties
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mohak", 7));
        studentList.add(new Student("Anuj", 2));
        studentList.add(new Student("Shivam", 3));
        studentList.add(new Student("Rohit", 1));

        // Collections.sort(studentList); // Compilation Error if you remove 'implements
        // Comparable' from Student.java: The method sort(List<T>)
        // in the type Collections is not applicable for
        // the arguments (List<Student>)
        // This error happens because there is no definition regarding how the objects
        // of the Student class must be sorted.
        // To prevent this, we must define an interface called Comparable Interface.

        // Student s1 = new Student("Anuj", 2);
        // Student s2 = new Student("Rohit", 3);
        // System.out.println(s1.compareTo(s2)); // compared on the basis of roll no. as
        // defined in our compareTo()

        System.out.println(studentList);
        Collections.sort(studentList); // sorted on the basis of roll no. as defined
        // in our compareTo()
        System.out.println(studentList);
        // Now, if we want to sort by Student's name, we can:
        // In Student.java, change compareTo()
        // But, what if we also we want to keep the roll no. comparison open apart from
        // this name based comparison? In such cases, use Comparator interface.
        // Collections.sort(studentList, new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {
        // Student o1 > Student o2 -> return +ve
        // Student o1 < Student o2 -> return -ve
        // Student o1 == Student o2 -> return 0
        // return o1.name.compareTo(o2.name); // no need to define this compareTo() as
        // comparison for names
        // // (String) is inbuilt in Java.
        // }
        // });
        // You can write the above in one-line using Lambda function as shown below:
        Collections.sort(studentList, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(studentList);

        /////////////////////////////////////

    }
}
