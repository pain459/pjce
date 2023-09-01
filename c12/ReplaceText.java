package c12;
import java.io.*;
import java.util.*;

public class ReplaceText {
    public static void main(String[] args) throws IOException{
        // Check command line parameter usage.
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldSrt newStr");
            System.exit(1);
        }

        // Check ff the source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(3);
        }

        // Check if the target file exists
        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Target file " + args[1] + " does not exist");
            System.exit(3);
        }
        try (
                // create input and output files
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
                ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }
        }
    }
}
