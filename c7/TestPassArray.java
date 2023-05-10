public class TestPassArray {
    public static void main(String[] args) {
        int[] a = { 1, 2 };
        // swap elements using the swap method
        System.out.print("Before invoking swap ");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        // method for false swap comes here
        swap(a[0], a[1]); // this if false swap
        System.out.print("After invoking swap ");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        System.out.println("--------------------------------------------");
        // real swap method comes now.
        System.out.print("Before invoking swapFirstTwoInArray method ");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        // method for false swap comes here
        swapFirstTwoInArray(a); // this if real swap with just input array
        System.out.print("After invoking swapFirstTwoInArray method ");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("Data inside swap method is {" + n1 + ", " + n2 + "}");
    }

    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        System.out.println("Data inside swapFirstTwoInArray method is {" + array[0] + ", " + array[1] + "}");
    }
}
