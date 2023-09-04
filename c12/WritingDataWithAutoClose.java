package c12;

import java.io.IOException;

public class WritingDataWithAutoClose {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("testing_file_class/scores2.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        } else if (file.createNewFile()){
//            file.createNewFile();
            System.out.println("Created a new file.");
        }
        try (
                // create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file);
                ) {
            // Write formatted output to the file.
            output.print("RRR ");
            output.println(99);
            output.print("SSS ");
            output.println(85);
        }
    }
}
