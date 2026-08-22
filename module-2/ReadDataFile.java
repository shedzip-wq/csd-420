
/**
 * Sheridan Dela Cruz
 * Date: 08/22/2026
 * Assignment: Module 2.2
 * Description: Reads and displays the contents of Sheridan_datafile.dat.
 */

import java.io.File;
import java.util.Scanner;

public class ReadDataFile {

    public static void main(String[] args) {

        // File stored in module-2 using a relative path
        File file = new File("Sheridan_datafile.dat");

        // Check if file exists before reading
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        try {
            // Scanner reads file line-by-line
            Scanner input = new Scanner(file);

            // Display each line from the file
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

            // Close scanner
            input.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}