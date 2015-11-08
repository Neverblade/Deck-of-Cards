/** The abstraction for a deck of cards.
 *  Supports shuffling and the drawing of cards.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    private List<Card> deck;
    
    public Deck() {
        this.deck = new ArrayList<Card>();
        Shuffle();
    }
    
    /** The deck gets cleared and reset, then shuffled. */
    public void Shuffle() {
        deck.clear();
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) {
                Card c = new Card(i, suit);
                deck.add(c);
            }
        }
        Collections.shuffle(deck);
    }
    
    /** Draw a card. If the deck is empty, throw an exception. */
    public Card GetNextCard() throws IllegalStateException {
        if (deck.size() == 0) {
            throw new IllegalStateException("The deck is empty.");
        }
        Card c = deck.remove(0);
        return c;
    }
    
    /** A tester method that tests the various components of the deck framework. */
    public static void main(String[] args) {
        int iterations = Integer.parseInt(args[0]);
        System.out.println("Creating a deck of 52 cards.\n");
        Deck deck = new Deck();
        for (int i = 0; i < iterations; i++) {
            while (true) {
                try {
                    Card c = deck.GetNextCard();
                    System.out.println("Pulled " + c);
                } catch (IllegalStateException e) {
                    System.out.println("Deck is empty.");
                    break;
                }
            }
            deck.Shuffle();
            System.out.println("\nShuffling deck.\n");
        }
    }
}