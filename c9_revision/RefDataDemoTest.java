package c9_revision;

public class RefDataDemoTest {
    public static void main(String[] args) {
        System.out.println("Student data and details.");
        RefDataDemo s1 = new RefDataDemo();
        s1.addStudentRecordPublic("RRR", 1, 1395988);
        s1.getStudentRecordWithRank(1);
        RefDataDemo s2 = new RefDataDemo();
        s2.getStudentRecordWithRank(0); // some details will come as null and this is expected.
        RefDataDemo s3 = new RefDataDemo();
        s3.getStudentRecordWithRank(3);
    }
}
