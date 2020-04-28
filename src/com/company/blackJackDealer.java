package com.company;

public class blackJackDealer extends Player {

    @Override
    public boolean wantsHit(Hand ownHand, Hand opponentHand) {
        return false;
    }
}
