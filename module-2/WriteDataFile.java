
/**
 * Sheridan Dela Cruz
 * Date: 08/22/2026
 * Assignment: Module 2.2
 * Description: Generates five random integers and five random doubles.
 * Writes/appends them to Sheridan_datafile.dat using a relative path.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class WriteDataFile {

    public static void main(String[] args) {

        // File stored in module-2 using a relative path
        File file = new File("Sheridan_datafile.dat");

        try {
            // FileWriter in append mode (true)
            FileWriter fw = new FileWriter(file, true);
            PrintWriter out = new PrintWriter(fw);

            Random rand = new Random();

            // Arrays to store random values
            int[] intArray = new int[5];
            double[] doubleArray = new double[5];

            // Fill integer array with random values
            for (int i = 0; i < 5; i++) {
                intArray[i] = rand.nextInt(100); // 0–99
            }

            // Fill double array with random values
            for (int i = 0; i < 5; i++) {
                doubleArray[i] = rand.nextDouble() * 100; // 0–100
            }

            // Write integer values to file
            out.println("Integers:");
            for (int n : intArray) {
                out.print(n + " ");
            }
            out.println();

            // Write double values to file
            out.println("Doubles:");
            for (double d : doubleArray) {
                out.print(d + " ");
            }
            out.println();

            // Separator for readability
            out.println("------------------------");

            // Close writers
            out.close();
            fw.close();

            System.out.println("Data written/appended.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}