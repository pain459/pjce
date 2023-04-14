import java.util.Scanner;
public class prog4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geometry: Area of the pentagon.");
        System.out.print("Enter the length from the center to the vertex: ");
        double _r = input.nextDouble();
        double _s = 2 * _r * Math.sin(Math.PI / 5);
        double _area = (5 * Math.pow(_s, 2)) / (4 * Math.tan(Math.PI / 5)); 
        System.out.printf("Calculated side of pentagon is %.2f\n", _s);
        System.out.printf("%.2f\n" , _area);
    }
}