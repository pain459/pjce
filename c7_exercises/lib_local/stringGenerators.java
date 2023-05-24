package lib_local;

public class stringGenerators {
    public static String generateStringWithTwoLetters(int length, char one, char two) {
        String generatedString = "";
        for (int i = 0; i < length; i++) {
            if ((int) (Math.random() * 10) > 5) {
                generatedString += one;
            } else {
                generatedString += two;
            }
        }
        return generatedString;
    }
}
