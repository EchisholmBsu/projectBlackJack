package com.company;

import java.util.Scanner;

public class ConsolePlayer extends Player {
    private Scanner Response;

    public ConsolePlayer(Scanner Response){
        this.Response = Response;
    } // Scanner
    @Override
    public boolean wantsHit(Hand ownHand, Hand opponentHand) {
        System.out.println("Want Another Hit (y/n)?");  // Asking Question
        String Decision = Response.next();
         // Grabs our Response
        if ((Decision.charAt(0) == 'y'))
            return true;
        else if (Decision.charAt(0) == 'n')
            return false;
        else return wantsHit(ownHand, opponentHand);
        // If response was y it will do another hit if N it will go to dealers turn.
        // Anything thats not Y/N the it will ask the question again
    }
}