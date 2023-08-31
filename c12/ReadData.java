package c12;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {
        // Create a file instance
        File file = new File("testing_file_class/test.txt");

        // Create a scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = Integer.parseInt(input.next());
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
    }

}
