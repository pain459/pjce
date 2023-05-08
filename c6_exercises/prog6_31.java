public class prog6_31 {
    public static void main(String[] args) {
        System.out.println("Financial: Credit card number validation");
        String creditCardNumber = "4388576018410707";
        // String creditCardNumber = "438857601841070A";
        System.out.println(cardDataCheck(creditCardNumber));
        // System.out.println(doubledAlternates(creditCardNumber));
    }

    /** check if the cc number have required number of digits */
    public static boolean cardDataCheck(String number) {
        int _verified = 0;
        for (char c : number.toCharArray()) {
            _verified += (Character.isDigit(c) ? 1 : 0);
        }
        return (_verified == 16 ? true : false);
    }

    /** to be continued as long project. */
}
