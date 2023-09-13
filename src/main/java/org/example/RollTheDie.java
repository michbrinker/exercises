package org.example;

import java.util.Random;

public class RollTheDie {
    static int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int totalSpaces = 20;
        int currentSpace = 0;
        int diceRolls = 5;

        for (int i = 0; i < diceRolls; i++ ) {
            int die = rollDie();
            currentSpace += die;
            if (currentSpace == totalSpaces) {
                System.out.println("You advanced to the end and won!");
                break;
            } else if (currentSpace > totalSpaces) {
                System.out.println("You went over the total space and lost!");
                break;
            }
            System.out.println("You advanced to space " + currentSpace +
                    " and you have " + (totalSpaces - currentSpace) + " more spaces to go.");
        }

        System.out.println("Game over!");
    }
}
