package com.pluralsight;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("What is your name?");
            String player1 = scanner.nextLine();
            System.out.println("What is your name?");
            String player2 = scanner.nextLine();
            System.out.println(player1 + " VS "+ player2);

            Deck deck = new Deck();

        deck.shuffle();

        //collections.deck: I knew I needed to shuffle the deck and then assign the players.








    }
}
