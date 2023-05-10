public class LinearSearch {
    // The method for finding a key in the list
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++){
            if (key == list[i]) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 3, 5, 6, 7};
        int j = linearSearch(list, 1);
        System.out.print(j);
    }
}
