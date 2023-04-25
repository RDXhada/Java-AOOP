// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing application.

import java.sql.SQLOutput;

public class DeckOfCardsTest
{
   // execute application
   public static void main( String args[] )
   {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order
      
      // print all 52 Cards in the order in which they are dealt
//      for ( int i = 0; i < 13; i++ )
//      {
//         // deal and print 4 Cards
//         System.out.printf( "%-20s%-20s%-20s%-20s\n",
//            myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
//            myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
//      } // end for
      System.out.printf("%-20s%-20s%n", "left-hand","right-hand");
      Card[] leftHand = myDeckOfCards.dealHand();
      Card[] rightHand = myDeckOfCards.dealHand();
      for (int i = 0; i < leftHand.length; i++)
      {
         System.out.printf("%-20s%-20s%n", leftHand[i], rightHand[i]);
      }

      System.out.printf("%-20s%n", "Hand values");
      printValues(myDeckOfCards, leftHand);
      printValues(myDeckOfCards,rightHand);
   } // end main
   private static int printValues(DeckOfCards deck, Card[] hand)
   {
      if(deck.hasPair(hand))
      {
         System.out.printf("%-20s","One pair!");
         return 1;
      }
      if(deck.hasTwoPairs(hand))
      {
         System.out.printf("%-20s","Two pair!");
         return 2;
      }
      if(deck.hasThreeOfKind(hand))
      {
         System.out.printf("%-20s","Three of a kind!");
         return 3;
      }
      if(deck.hasFourOfKind(hand))
      {
         System.out.printf("%-20s","Three of a kind!");
         return 4;
      }
      if(deck.hasFlush(hand))
      {
         System.out.printf("%-20s","Flush!");
         return 5;
      }
      if(deck.hasStraight(hand))
      {
         System.out.printf("%-20s","Straight!");
         return 6;
      }
      System.out.printf("%-20s","None!");

      return 0;
   }
} // end class DeckOfCardsTest

