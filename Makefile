
.PHONY: compile clean

SHELL = bash

SRCS = Card.java Deck.java Suit.java

CLASSES = $(SRCS:.java=.class)

%.class: %.java
	javac -g $<

compile: $(CLASSES)

clean:
	$(RM) *.class *~ OUT
