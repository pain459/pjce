public class exploringDateClass {
    public static void main(String[] args) {
        System.out.println("Exploring date class.");
        java.util.Date date = new java.util.Date();
        System.out.println("Date in ms " + date.getTime());
        System.out.println("Date in string " + date.toString());
        System.out.println(date.toInstant());
    }
}
