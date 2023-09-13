package org.example.game;

import java.util.Scanner;
import java.util.stream.Stream;

public class CoinTossGame {
    public static String getOpposite(String guess){
        if(Coin.HEADS_OR_TAILS.heads.name().equals(guess)){
            return Coin.HEADS_OR_TAILS.tails.name();
        } else {
            return Coin.HEADS_OR_TAILS.heads.name();
        }
    }

    public static Boolean isValidGuess(String guess){
        return Stream.of(Coin.HEADS_OR_TAILS.values()).anyMatch(v -> v.name().equals(guess));
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        Player player1 = new Player("Jack");
        Player player2 = new Player("Jill");

        Scanner scanner = new Scanner(System.in);
        String guess;
        do {
            System.out.println("Choose heads or tails.");
            guess = scanner.next().toLowerCase();
        } while(!isValidGuess(guess));
        scanner.close();

        player1.setGuess(guess);
        player2.setGuess(getOpposite(guess));

        coin.flip();
        System.out.println("The coin came up " + coin.getSide());
        if(coin.getSide().equals(player1.getGuess())){
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
