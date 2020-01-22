/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. 
 * To be used as starting code in ICE 1
 * @author Megha Patel
 * @modifier: Zhao Wang
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        System.out.println("Seven random cards are generated magically below");
        for (int i=0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.getRandomValue());
            c.setSuit(Card.SUITS[c.getRandomSuit()]);
            magicHand[i] = c;
            System.out.println(c.getSuit() + c.getValue());
        }

        System.out.println("Please enter the card value:");
        int cardval = input.nextInt();
        System.out.println("Please enter one of these card suits:"
                + " \"Hearts\", \"Diamonds\", \"Spades\", and \"Clubs\"");
        String cardsuit = input.next();
        
        boolean correctCard = false;
        for (int count = 0; count < magicHand.length; count++){
            if (cardval == magicHand[count].getValue() &&
                    cardsuit.equalsIgnoreCase(magicHand[count].getSuit())){
                correctCard = true;
                break;
            }
        }
        
        
        if(correctCard==true){
            System.out.println("Your draw matches!");
        }
        
        else
            System.out.println("Oh no, match failed.");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
}
