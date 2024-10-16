package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowingCheckedExceptions {

       // Method to read from a file
    public static void readFile(String filename) throws FileNotFoundException {
        FileReader file = new FileReader(filename);
        BufferedReader br = new BufferedReader(file);

        String line;
        System.out.println("Contents of the file:");
        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException ioe) {
            System.out.println("An error occurred while reading the file.");
            ioe.printStackTrace(); // Print stack trace for any IO issues
        } finally {
            try {
                br.close(); // Close the BufferedReader
            } catch (IOException e) {
                System.out.println("Error closing the file.");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String filename = "sample.txt"; // Specify the file to read

        try {
            readFile(filename);
        } catch (FileNotFoundException fne) {
            System.out.println("Error: The file '" + filename + "' was not found.");
            fne.printStackTrace(); // Print stack trace to help debug
        }

        System.out.println("Program continues to execute..."); // Indicate that the program is still running
    }
}
