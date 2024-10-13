package FileHandling;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class StudentRecordManagement {

    private File studentRecordsFile;

    public StudentRecordManagement(String filename) {
        studentRecordsFile = new File(filename);
        validateFile();
    }

    private void validateFile() {
        try {
            if (!studentRecordsFile.exists()) {
                studentRecordsFile.createNewFile();
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    // Method to add student record
    private String addStudent(String recordToAdd) {
        try (RandomAccessFile raf = new RandomAccessFile(studentRecordsFile, "rw")) {
            String[] stringSplit = recordToAdd.split(",");
            String newStudentId = stringSplit[1];
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                String record = raf.readLine();
                String[] recordDetails = record.split(",");
                String studentId = recordDetails[1];

                if (studentId.equals(newStudentId)) {
                    found = true;
                    return "Provided student ID already exists, please proceed with updating the record.";
                }
            }

            if (!found) {
                raf.writeBytes(recordToAdd);
                raf.writeBytes(System.lineSeparator());
            }
            return "Record added successfully.";
        } catch (IOException ioe) {
            return "IO Exception occurred: " + ioe.getMessage();
        }
    }

    // Method to update the record
    private String updateStudent(Scanner sc) {
        System.out.println("Enter student ID to update their record:");
        String studentIdToFind = sc.nextLine();

        try (RandomAccessFile raf = new RandomAccessFile(studentRecordsFile, "rw")) {
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                String record = raf.readLine();
                String[] recordDetails = record.split(",");
                String studentId = recordDetails[1];

                if (studentId.equals(studentIdToFind)) {
                    found = true;
                    System.out.println("Enter updated name: ");
                    String newName = sc.nextLine();
                    System.out.println("Enter new grade: ");
                    String newGrade = sc.nextLine();

                    // Update record
                    recordDetails[0] = newName;
                    recordDetails[2] = newGrade;

                    // Move back to the start of the record to overwrite
                    raf.seek(raf.getFilePointer() - record.length() - 2); // Move back to the start of the line
                    raf.writeBytes(String.join(",", recordDetails));
                    raf.writeBytes(System.lineSeparator());
                    break;
                }
            }

            return found ? "Record updated successfully." : "Given student ID not found. Please check and try again.";
        } catch (IOException ioe) {
            return "IO Exception occurred: " + ioe.getMessage();
        }
    }

    // Method to delete record
    private String deleteStudentRecord(Scanner sc) {
        System.out.println("Enter student ID to delete student record:");
        String studentId = sc.nextLine();

        try (RandomAccessFile raf = new RandomAccessFile(studentRecordsFile, "rw")) {
            List<String> updatedRecords = new ArrayList<>();
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                String record = raf.readLine();
                String[] recordDetails = record.split(",");
                String studentIdFromRecord = recordDetails[1];
                
                if (studentIdFromRecord.equals(studentId)) {
                    found = true; // Record found for deletion
                    continue;
                }
                updatedRecords.add(record);
            }

            // Write updated records back to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(studentRecordsFile))) {
                for (String updatedRecord : updatedRecords) {
                    writer.write(updatedRecord);
                    writer.newLine();
                }
            }

            return found ? "Student deleted successfully." : "Student ID not found.";
        } catch (IOException ioe) {
            return "IO Exception occurred: " + ioe.getMessage();
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement studentRecordManagement = new StudentRecordManagement("studentRecords.txt");
        Scanner sc = new Scanner(System.in);
        int exit = 0;

        while (exit != 1) {
            System.out.println("Please select an operation from the menu:");
            System.out.println("0: Exit");
            System.out.println("1: Add student record");
            System.out.println("2: Update student record");
            System.out.println("3: Delete student record");

            // Ensure input is available
            if (sc.hasNextByte()) {
                byte command = sc.nextByte();
                sc.nextLine(); // Consume the newline character

                switch (command) {
                    case 0 -> exit = 1;
                    case 1 -> {
                        System.out.println("Enter student name:");
                        String name = sc.nextLine();
                        System.out.println("Enter student ID to add:");
                        String id = sc.nextLine();
                        System.out.println("Enter student grade: ");
                        String grade = sc.nextLine();

                        String studentRecord = name + "," + id + "," + grade;
                        String response = studentRecordManagement.addStudent(studentRecord);
                        System.out.println(response);
                    }
                    case 2 -> {
                        String response = studentRecordManagement.updateStudent(sc);
                        System.out.println(response);
                    }
                    case 3 -> {
                        String response = studentRecordManagement.deleteStudentRecord(sc);
                        System.out.println(response);
                    }
                    default -> System.out.println("Invalid command. Please try again.");
                }
            } else {
                System.out.println("No input available. Please enter a valid command.");
                sc.nextLine(); // Clear the invalid input
            }
        }

        sc.close(); // Close the scanner only once, after the loop
    }
}
