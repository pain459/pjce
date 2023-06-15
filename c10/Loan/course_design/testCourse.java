package c10.Loan.course_design;

public class testCourse {
    public static void main(String[] args) {
        System.out.println("Designing a course class");
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        course1.addStudent("RRR");
        course1.addStudent("SSS");
        course1.addStudent("TTT");

        course2.addStudent("AAA");
        course2.addStudent("BBB");
        course2.addStudent("CCC");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        System.out.println("List of students in course1 is: " + course1.getStudents().toString());

        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());

        course1.dropStudent("TTT");
        System.out.println("List of students after dropping TTT: " + course1.getStudents().toString());

        course1.dropStudent("TTT"); // no impact as the entry is already deleted.
        System.out.println("List of students after dropping TTT twice: " + course1.getStudents().toString());
    }
}
