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
        System.out.println(player1 + " VS " + player2);

        Deck deck = new Deck();
        Hand hand1 = new Hand();

        for (int I = 0; I < 5; I++) {
            //get a card from the deck
            Card card = deck.deal();
            //deal that card to the hand
            hand1.deal(card);
        }
        int handValue = hand1.getValue();
        System.out.println( "\nThis hand is worth " + handValue);

    }

    //collections.deck: I knew I needed to shuffle the deck and then assign the players.


}

