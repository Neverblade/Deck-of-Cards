This is a framework abstraction for a generic deck of cards. It supports shuffling (which resets the deck), and the ability to draw cards.

The framework is written in Java. To compile the code, use the provided Makefile to compile and clean, with the following commands:
    make compile
    make clean
    
I decided to make value an integer because it'd make it easier to calculate scores for implementations of card games. I also decided to make suits an enum instead of, say, an array of strings. This is because having enums with its separate file meant it'd be easier to implement additional support and functionality in the future.

Within Deck.java, there is a simple test that shuffles and prints out the drawn cards of a deck and outputs the results to stdin. I used that to quickly confirm that my framework was working. More rigorous tests would include checking to make sure that every card was drawn, that not repeats occurred, and checking for strange behavior during edge cases.
