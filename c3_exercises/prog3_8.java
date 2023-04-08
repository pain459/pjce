import java.util.Scanner;
public class prog3_8 {
    // display integers in descending order
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will sort the integers(3)");
        System.out.print("Enter integer1: ");
        int _int1 = input.nextInt();
        System.out.print("Enter integet2: ");
        int _int2 = input.nextInt();
        System.out.print("Enter integer3: ");
        int _int3 = input.nextInt();
        // sorting starts here
        int _dummy = 0;
        if (_int1 > _int2) {
            _dummy = _int1;
            _int1 = _int2;
            _int2 = _dummy;            
        }
        System.out.println(_int1 + " " + _int2 + " " + _int3);
        if (_int2 > _int3) {
            _dummy = _int2;
            _int2 = _int3;
            _int3 = _dummy;
        }
        if (_int1 > _int2) {
            _dummy = _int1;
            _int1 = _int2;
            _int2 = _dummy;            
        }
        System.out.println(_int1 + " " + _int2 + " " + _int3);
    }
}
