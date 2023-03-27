package c7;
public class AnalyzeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        // creating a array
        double [] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        // System.out.println(numbers);
        // System.out.println(sum);
        double average = sum / n;
        int count = 0; // number of elements above average
        for (int i = 0; i < n; i++) {
            if (numbers[i] >average) {
                count++;
            }
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above average is " + count);
    }
    
}
