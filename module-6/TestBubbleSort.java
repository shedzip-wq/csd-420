
/**
* Sheridan Dela Cruz
* Date: 09/12/2026
* Assignment: Module 6.2 
* TestBubbleSort - Tests both bubble sort methods.
 */

import java.util.Arrays;
import java.util.Comparator;

public class TestBubbleSort {

    public static void main(String[] args) {

     
        // Test 1: Comparable (Integer)
        Integer[] nums = { 9, 3, 7, 1, 4 };

        System.out.println("Original Integer Array:");
        System.out.println(Arrays.toString(nums));

        BubbleSort.bubbleSortComparable(nums);

        System.out.println("Sorted Using Comparable:");
        System.out.println(Arrays.toString(nums));

     
        // Test 2: Comparator (Person)
        Person[] people = {
                new Person("Sheridan", 48),
                new Person("Fred", 53),
                new Person("Greyson", 10)
        };

        System.out.println("\nOriginal Person Array:");
        System.out.println(Arrays.toString(people));

        // Sort by age using Comparator
        Comparator<Person> ageComparator = (p1, p2) -> p1.getAge() - p2.getAge();

        BubbleSort.bubbleSortComparator(people, ageComparator);

        System.out.println("Sorted Using Comparator (Age):");
        System.out.println(Arrays.toString(people));
    }
}
