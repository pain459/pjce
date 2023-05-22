public class prog7_10 {
    public static void main(String[] args) {
        // int[] testArray = { 5, 3, 60, 4, 3 };
        int[] testArray = { 5 };
        int maxValue = 0;
        int maxValueLoc = -1;
        for (int i = 0; i < testArray.length; i++) {
            if (testArray.length == 1) {
                // maxValue = testArray[0];
                maxValueLoc = 0;
            } else if (testArray[i] >= maxValue) {
                maxValue = testArray[i];
                maxValueLoc = i;
            }
        }
        System.out.println("Index of highest value in given array is " + maxValueLoc);
    }
}
