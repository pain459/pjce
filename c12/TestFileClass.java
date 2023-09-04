package c12;

import java.io.IOException;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
        java.io.File file1 = new java.io.File("testing_file_class//us.txt");
        if (file1.createNewFile()) {
            System.out.println("File1 is created.");
        } else {
            System.out.println("File1 already exists.");
        }
        java.io.File file2 = new java.io.File("test.txt");
        if (file2.createNewFile()) {
            System.out.println("File2 is created.");
        } else {
            System.out.println("File2 already exists");
        }
        System.out.println("Absolute path of file1 is " + file2.getAbsolutePath());

        // Focussing on file1 only for now.
        System.out.println("Does the file exist? " + file1.exists());
        System.out.println("The file has " + file1.length() + " bytes");
        System.out.println("Can read? " + file1.canRead());
        System.out.println("Can be written? " + file1.canWrite());
        System.out.println("Is a directory? " + file1.isDirectory());
        System.out.println("Is hidden? " + file1.isHidden());
        System.out.println("Absolute path of file2 is " + file1.getAbsolutePath());
        System.out.println("File1 last modified on " + new java.util.Date(file1.lastModified()));
    }
}