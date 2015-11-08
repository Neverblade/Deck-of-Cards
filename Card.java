import java.util.HashMap;

public class Card {
    
    private int value;
    private Suit suit;
    
    private static HashMap<Integer, String> valueConversions;
    static {
        valueConversions = new HashMap<Integer, String>();
        valueConversions.put(1, "Ace");
        valueConversions.put(11, "Jack");
        valueConversions.put(12, "Queen");
        valueConversions.put(13, "King");
    }
    
    
    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public Suit getSuit() {
        return suit;
    }
    
    public String toString() {
        String s;
        if (valueConversions.containsKey(value)) {
            s = valueConversions.get(value);
        } else {
            s = "" + value;
        }
        s += " of " + this.suit;
        return s;
    }
}