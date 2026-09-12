
/**
* Sheridan Dela Cruz
* Date: 09/12/2026
* Assignment: Module 6.2
* Description: Module 6 Programming Assignment
 * BubbleSort class implementing two generic bubble sort methods:
 * 1. Using Comparable<T>
 * 2. Using Comparator<T>
 */

import java.util.Comparator;

public class BubbleSort {

    /**
     * Bubble sort using Comparable interface.
     * Elements must implement Comparable<T>.
     */
    public static <T extends Comparable<T>> void bubbleSortComparable(T[] array) {
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop early if no swaps
            if (!swapped)
                break;
        }
    }

    /**
     * Bubble sort using Comparator interface.
     * Comparator determines the sorting logic.
     */
    public static <T> void bubbleSortComparator(T[] array, Comparator<T> comp) {
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (comp.compare(array[j], array[j + 1]) > 0) {
                    // Swap
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}