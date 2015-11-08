public enum Suit {
        SPADES, HEARTS, DIAMONDS, CLUBS;
        
        public String toString() {
            String s = name();
            return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        }
}