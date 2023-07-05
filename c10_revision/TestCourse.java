package c10_revision;

import java.util.Arrays;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        System.out.println(Arrays.toString(course1.getStudents()));
    }
}
