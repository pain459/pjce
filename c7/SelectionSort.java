package c7;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // find the minimum in the list
            double currentMin = list[i];
            int currentminIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list [j]) {
                    currentMin = list[j];
                    currentminIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentminIndex != i)  {
                list[currentminIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println("Before sorting " + Arrays.toString(list));
        selectionSort(list);
        // System.out.println(list);
        System.out.println("After sorting " + Arrays.toString(list));
    }
    

}
