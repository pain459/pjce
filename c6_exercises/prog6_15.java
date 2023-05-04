public class prog6_15 {
    public static void main(String[] args) {
        System.out.println("Financial application: Print a tax table");
        tableFormat();
        // col1NetIncome(70000);
        // System.out.printf("%s", col1NetIncome(60000));
        calculateTaxIterations(50500);
    }

    public static void calculateTaxIterations(int _income) {
        // int _value = 0;
        for (int i = 50000; i <= _income; i+= 100) {
            // _value = i;
            // System.out.println(i);
            System.out.printf("%s%20s%13s%26s%20s\n", i, Math.round(computeTax(0, i)), Math.round(computeTax(1, i)), 
            Math.round(computeTax(2, i)), Math.round(computeTax(3, i)));
        }
    }

    public static void tableFormat() {
        System.out.printf("%s%20s%20s%20s%20s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%s%20s%21s%21s%19s\n", "Income", " ", "or Qualifying", "Separate", "a House");
        System.out.printf("%s%20s%22s%20s%20s\n", " ", " ", "Widow(er)", "", "");
        System.out.printf("----------------------------------------------------------------------------------------\n");
    }

    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;

        if (status == 0){
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
            }
            else if (taxableIncome <= 33950) {
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            }
            else if (taxableIncome <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            }
            else if (taxableIncome <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            }
            else if (taxableIncome <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.25 + (taxableIncome - 171550) * 0.33;
            }
            else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.25 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        }
        else if (status == 1){
            if (taxableIncome <= 16700) {
                tax = taxableIncome * 0.10;
            }
            else if (taxableIncome <= 67900) {
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            }
            else if (taxableIncome <= 137050) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 137050) * 0.25;
            }
            else if (taxableIncome <= 208850) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
            }
            else if (taxableIncome <= 372950) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.25 + (taxableIncome - 208850) * 0.33;
            }
            else {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.25 + (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        }
        else if (status == 2){
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
            }
            else if (taxableIncome <= 33950) {
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            }
            else if (taxableIncome <= 68525) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            }
            else if (taxableIncome <= 104425) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
            }
            else if (taxableIncome <= 186475) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.25 + (taxableIncome - 104425) * 0.33;
            }
            else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.25 + (186475 - 104425) * 0.33 + (taxableIncome - 186425) * 0.35;
            }
        }
        else if (status == 3){
            if (taxableIncome <= 11950) {
                tax = taxableIncome * 0.10;
            }
            else if (taxableIncome <= 45550) {
                tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
            }
            else if (taxableIncome <= 117450) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
            }
            else if (taxableIncome <= 190200) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 117540) * 0.28;
            }
            else if (taxableIncome <= 372950) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.25 + (taxableIncome - 190200) * 0.33;
            }
            else {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.25 + (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        }
        return tax;
    }
}


// print table from 50000 to 70000 with an increment of 100