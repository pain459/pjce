package c12;

import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("testing_file_class//scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        } else {
            file.createNewFile();
            System.out.println("Created the file and continuing further.");
//        } else {
//            System.out.println("Unknown error occurred.");
//            System.exit(1);
//        }
            // Create a file
            java.io.PrintWriter output = new java.io.PrintWriter(file);

            // Write a formatted output to a file.
            output.print("RRR ");
            output.println(99);
            output.print("SSS ");
            output.println(85);

            // Close the file
            output.close();
        }
    }
}
