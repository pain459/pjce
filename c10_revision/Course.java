package c10_revision;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent (String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        String objectToRemove = student;

        int indexToRemove = -1;
        for (int i = 0; i < getNumberOfStudents(); i++) {
            if (students[i].equals(objectToRemove)) {
                indexToRemove = i;
                break;
            }
        }

        String[] updatedNames = new String[students.length - 1];

        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (i != indexToRemove) {
                updatedNames[index] = students[i];
                index++;
            }
        }
        this.students = new String[updatedNames.length];
        System.arraycopy(updatedNames, 0, this.students, 0, updatedNames.length);
        System.out.println("Updated students db.");
    }

}
