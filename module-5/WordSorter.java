
/**
* Sheridan Dela Cruz
* Date: 09/04/2026
* Assignment: Module 5.2
* Description: This program reads words from a text file named
* collection_of_words.txt and stores them in a TreeSet to automatically
* remove duplicates and sort them. It then displays all unique words in
* ascending order and in descending order. Test code is included to verify
* correct functionality.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSorter {

    public static void main(String[] args) {

        // TreeSet automatically sorts in ascending order and removes duplicates
        Set<String> words = new TreeSet<>();

        try {
            File file = new File("collection_of_words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                words.add(word); // duplicates ignored automatically
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            return;
        }

        // Display ascending order
        System.out.println("Ascending Order:");
        for (String w : words) {
            System.out.println(w);
        }

        // Display descending order
        System.out.println("\nDescending Order:");
        List<String> descendingList = new ArrayList<>(words);
        Collections.reverse(descendingList);

        for (String w : descendingList) {
            System.out.println(w);
        }

        // Test code
        System.out.println("\n--- Test Code ---");
        System.out.println("Total unique words: " + words.size());
        System.out.println("Contains 'spark'? " + words.contains("spark"));
    }
}
