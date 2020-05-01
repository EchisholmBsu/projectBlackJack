package com.company;

public class blackJackDealer extends Player {


    // If the player's hand has a value of less than 21,
    // the dealer attempts to exceed the value of the player's hand. If the player's hand has a value of 21,
    // the dealer attempts to match it, unless the player has Blackjack (21 from the first two cards). And regardless of the value of the player's hand,
    // the dealer must take hits until her own hand has a value of at least 17.
    @Override
    public boolean wantsHit(Hand ownHand, Hand opponentHand) {
        if (ownHand.getValue() < 17) {
            return true;
        } else if (opponentHand.getValue() == 21) {
            if ((ownHand.getValue() < 17)) {
                return true;
            } else
                return false;
        }
        return false;
    }
}

