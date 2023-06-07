package c9_exercises;

public class prog9_2 {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("This program will determine the stock price change percent.");
        stockClass s1 = new stockClass("\u20B9", "ORCL");
//        s1.name = "ORCL";
//        s1.symbol = "\u20B9";  //to print rupee symbol.
        double percentChange = s1.getChangePercent(34.5, 34.35);
        System.out.println("Stock " + s1.name + " traded in " + s1.symbol + " is changed by " + percentChange + " %");
    }
}

class stockClass {
    /** Data fields */
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
//    stockClass() {
//    }

    stockClass(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent (double previousClosingPrice, double currentPrice) {
        return ((currentPrice - previousClosingPrice) / Math.abs(previousClosingPrice)) * 100;
    }
}
