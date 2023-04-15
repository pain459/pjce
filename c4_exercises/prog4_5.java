import java.util.*;
public class prog4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geometry: area of a rectangular polygon");
        System.out.print("Enter the number of sides: ");
        int _n = input.nextInt();
        System.out.print("Enter the side: ");
        double _s = input.nextDouble();
        double _area = (_n * Math.pow(_s, 2)) / (4 * Math.tan(Math.PI / _n));
        System.out.println("The area of a polygon is " + _area); 
    }
}
