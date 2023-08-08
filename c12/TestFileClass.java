package c12;

public class TestFileClass{
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/example.txt");
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Is file hidden? " + file.isHidden());
        System.out.println(file.getPath());
        System.out.println(file.length());
    }
}
