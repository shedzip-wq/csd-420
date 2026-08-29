
/**
 * Sheridan Dela Cruz
 * Date: 08/29/2026
 * Assignment: Module 4.2
 * Description: This program stores integers in a LinkedList and compares the time
 * required to traverse the list using an iterator versus using get(index).
 * It tests both 50,000 and 500,000 integers and prints the timing results.
 */

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTimingTest {

    public static void main(String[] args) {

        // Test with 50,000 integers
        runTest(50000);

        // Test with 500,000 integers
        runTest(500000);
    }

    /**
     * Runs a timing test on a LinkedList using two traversal methods:
     * 1. Iterator traversal
     * 2. get(index) traversal
     *
     * @param size number of integers to store in the LinkedList
     */
    public static void runTest(int size) {

        LinkedList<Integer> list = new LinkedList<>();

        // Fill the list with integers 0 to size-1
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        System.out.println("\n--- Testing with " + size + " integers ---");

        // Measure iterator traversal time
        long startIterator = System.nanoTime();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        long endIterator = System.nanoTime();
        long iteratorTime = endIterator - startIterator;

        // Measure get(index) traversal time
        long startGet = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endGet = System.nanoTime();
        long getTime = endGet - startGet;

        System.out.println("Iterator traversal time: " + iteratorTime + " ns");
        System.out.println("get(index) traversal time: " + getTime + " ns");
    }
}

/*
 * Explanation of Results:
 * Traversing the LinkedList with an iterator is fast because it moves through
 * the nodes sequentially (O(n)). Using get(index) is extremely slow for large
 * LinkedLists because each access requires walking from the beginning of the
 * list to the requested index (O(n) per access, O(n^2) total). As the list size
 * increases from 50,000 to 500,000, iterator time increases slightly while
 * get(index) time grows dramatically.
 */
