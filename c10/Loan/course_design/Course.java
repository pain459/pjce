package c10.Loan.course_design;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
//    private String[] students = new String[100];
    private List<String> students = new ArrayList<>(100);
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
//        students[numberOfStudents] = student;
        students.add(student);
        numberOfStudents++;
    }

    public List<String> getStudents () {
        return students;
    }

    public int getNumberOfStudents () {
        return numberOfStudents;
    }

    public String getCourseName () {
        return courseName;
    }

    public void dropStudent(String student) {
        this.students.remove(student);
    }
}
