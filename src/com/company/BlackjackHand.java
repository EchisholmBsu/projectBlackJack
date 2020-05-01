package com.company;

public class BlackjackHand extends Hand {
    public boolean isBlackjack;



    public BlackjackHand() {
        super(20);
    }



    @Override
    public int getValue() {

        int handValue = 0;
        for (int i = 0; i < getNumCards(); i++) {
            Card card = getCard(i);
            if (card.isAce() && handValue > 11) {
                handValue += 1;
            } else if (card.isFaceCard()) {
                handValue += 10;
            }
            else handValue = handValue + card.getDefaultValue();

        }
        return handValue;
    }
    public void setBlackjack() {
        if (getNumCards() == 2 && getValue() == 21)
            isBlackjack = true;
    }
}