import java.util.Arrays;

import lib_local.*;
public class prog7_15 {
    public static void main(String[] args) {
        System.out.println("Eliminate duplicates.");
        int[] testArray = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
        int[] result = arrayOperations.eliminateDuplicates(testArray);
        System.out.println(Arrays.toString(result));
    }
}
