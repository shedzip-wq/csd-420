
/**
 * Sheridan Dela Cruz
 * Date: 08/29/2026
 * Assignment: Module 3.2
 * Description: This program generates 50 random integers from 1–20 and stores them in an ArrayList.
 * It then removes duplicates using a generic method and prints both lists.
 */

import java.util.ArrayList;
import java.util.Random;

public class TestProgram {

    public static void main(String[] args) {

        // Create the original list and fill it with random values
        ArrayList<Integer> originalList = new ArrayList<>();
        Random rand = new Random();

        // Fill with 50 random values from 1 to 20
        for (int i = 0; i < 50; i++) {
            originalList.add(rand.nextInt(20) + 1);
        }

        System.out.println("Original List:");
        System.out.println(originalList);

        // Remove duplicates
        ArrayList<Integer> noDuplicates = removeDuplicates(originalList);

        System.out.println("\nList Without Duplicates:");
        System.out.println(noDuplicates);
    }

    /**
     * Removes duplicate elements from the given ArrayList.
     * Returns a new ArrayList containing only the first occurrence
     * of each element.
     */
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();

        for (E element : list) {
            // Only add the element if it hasn't been added before
            if (!result.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
}
