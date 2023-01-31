package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author kelshane6
 * @author Shane Kelly Jan 31, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
                
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue(random.nextInt(1,13));
            hand[i].setSuit(Card.SUITS[random.nextInt(0,3)]);
            System.out.println(hand[i].getSuit() + " " +hand[i].getValue());

            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        Card userCard = new Card();
        
        System.out.print("Enter card value (1-13): ");
        userCard.setValue(input.nextInt());
        System.out.print("Enter card suit: ");
        userCard.setSuit(input.next());

        for (int i = 0; i < hand.length; i++) {
            
            if ((hand[i].getValue() == userCard.getValue()) && (hand[i].getSuit().equals(userCard.getSuit()))) {
                printInfo();
            }
        }
                           
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
              
        // If the guess is successful, invoke the printInfo() method below.
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        // I'm done!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Shane");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Receive a degree in computer science");
        System.out.println("-- Find a job I love doing");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Hockey");
        System.out.println("-- Gaming");
        System.out.println("-- Programming");
        System.out.println("-- Skateboarding");

        System.out.println();
        
    
    }

}
