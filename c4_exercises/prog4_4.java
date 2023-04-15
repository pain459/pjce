import java.util.Scanner;
public class prog4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geometry: Area of a hexagon.");
        System.out.print("Enter the side: ");
        double _s = input.nextDouble();
        double _area = (6 * Math.pow(_s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is %.2f\n" ,_area);
    }
}
