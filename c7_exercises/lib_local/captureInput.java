package lib_local;

import java.util.ArrayList;
import java.util.Scanner;

public class captureInput {
    // scanner: practically no limit on inputs and exits at negative number.
    public static int[] captureInputNegativeExit() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num < 0) {
                break;
            } else {
                userInput.add(num);
            }
        }
        int[] returnedArray = userInput.stream().mapToInt(i -> i).toArray(); // Convert arraylist to array and return it
                                                                             // from the method.
        return returnedArray;
    }

    public static int[] captureInputZeroExit() {
        System.out.println("(Enter 0 to exit) ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            } else {
                userInput.add(num);
            }
        }
        int[] returnedArray = userInput.stream().mapToInt(i -> i).toArray(); // Convert arraylist to array and return it
                                                                             // from the method.
        return returnedArray;
    }

    public static double[] captureArrayOfSize(int size) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + size + " double values:");
        double[] userInput = new double[size];
        for (int i = 0; i < size; i++) {
            double _input = input.nextDouble();
            userInput[i] = _input;
        }

        return userInput;
    }

    public static int[] captureArrayOfSizeInt(int size) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + size + " int values:");
        int[] userInput = new int[size];
        for (int i = 0; i < size; i++) {
            int _input = input.nextInt();
            userInput[i] = _input;
        }

        return userInput;
    }

    public static String[] captureStringsInArray(int size) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + size + " strings: ");
        String[] userInput = new String[size];
        for (int i = 0; i < size; i++) {
            String _input = input.nextLine();
            userInput[i] = _input;
        }

        return userInput;
    }
}
