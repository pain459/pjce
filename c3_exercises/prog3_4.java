<<<<<<< HEAD
// package c3_exercises;

=======
>>>>>>> 1c3f64a7486c5d01d82ebab92104353285ed346d
public class prog3_4 {
    public static void main(String[] args) {
        int _year = (int) (Math.random() * 10000);
        System.out.println("Year into consideration: " + _year);
        System.out.print("Month sorted: ");
        switch (_year % 12) {
            case 0:
                System.out.println("January");
                break;
            case 1:
                System.out.println("February");
                break;
            case 2:
                System.out.println("March");
                break;
            case 3:
                System.out.println("April");
                break;
            case 4:
                System.out.println("May");
                break;
            case 5:
                System.out.println("June");
                break;
            case 6:
                System.out.println("July");
                break;
            case 7:
                System.out.println("August");
                break;
            case 8:
                System.out.println("September");
                break;
            case 9:
                System.out.println("October");
                break;
            case 10:
                System.out.println("November");
                break;
            case 11:
                System.out.println("December");
                break;
        }
    }
}
