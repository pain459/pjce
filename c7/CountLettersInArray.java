// package c7;

public class CountLettersInArray {
    public static void main(String[] args) {
        // Declare and create an array
        char[] chars = createArray();
        // Display the array
        System.out.println("The lowercase letters are: ");
        displayArray(chars);
        // Count the occurences of each letters
        int[] counts = countLetters(chars);
        // Display counts
        System.out.println();
        System.out.println("The occurences of each character are: ");
        displayCounts(counts);
    }

    public static char[] createArray() {
        // declare an array of characters and create it
        char[] chars = new char[100];
        // create lowercase letters randomly and assign them to an array.
        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        // return an array
        return chars;
    }

    public static void displayArray(char[] chars) {
        // display the characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            }
            else {
                System.out.print(chars[i] + " ");
            }
        }      
    }

    public static int[] countLetters(char[] chars) {
        // declare and create an erray of 26 int
        int[] counts = new int[26];
        // for each lowercase letters in the array, count is
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i  + 1) % 10 == 0) {
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            }
            else {
                System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
            }
        }
    }
}