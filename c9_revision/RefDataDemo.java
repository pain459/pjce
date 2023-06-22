package c9_revision;

public class RefDataDemo {
    String name;
    int rank;
    int registrationNumber;
    private int studentRecord;

    RefDataDemo() {
//        studentRecord++;
        incrementStudentRecord();
    }

    private void incrementStudentRecord() {
        studentRecord++;
    }
    private void addStudentRecord(String name, int rank, int registrationNumber) {
        this.name = name;
        this.rank = rank;
        this.registrationNumber = registrationNumber;
    }

    void addStudentRecordPublic(String name, int rank, int registrationNumber) {
        addStudentRecord(name, rank, registrationNumber);
    }

    public void getStudentRecordWithRank(int rank) {
        System.out.println("Student record with serial number " + this.studentRecord);
        System.out.println("Student rank is " + this.rank);
        System.out.println("Student name is " + this.name);
        System.out.println("Student registration number is " + this.registrationNumber);
    }
}
