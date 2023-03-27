package c7;

import java.util.Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "9", "10", "Jack", "Queen", "King"};

        // Initialize the cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        // print the array to see data.
        // System.out.println(Arrays.toString(deck));

        // shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);  // generates the index randomly
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        // System.out.print(Arrays.toString(deck));
        // Display first 4 cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}
