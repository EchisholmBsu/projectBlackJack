package com.company;

import java.util.Scanner;

public class ConsolePlayer extends Player {
    private Scanner Response;


    public boolean wantsHit(Hand ownHand, Hand opponentHand) {
        System.out.println("Want Another Hit (y/n)?");
        while (true){
            String input = Response.nextLine();
            if (input.equals("y")){
                return true;
            } else if (input.equals("n")){
                return false;
            }
            else {System.out.println("Want Another Hit (y/n)?");
            }
        }
    }
}


