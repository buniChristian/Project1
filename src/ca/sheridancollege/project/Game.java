/*
 * @author Christian Buni and Al Justin Pinto
 * Tuesday, April 19, 20222
 */
package deliverable3;

import java.util.List;
import java.util.Scanner;

public class Game {

    public GroupOfCards deck;
    Player player = new Player();
    private Player userPlayer;
    private Player cpu;

    
    public void startGame() {
        System.out.println("Welcome to a game of War using Cards! It will consists of many rounds until there is a winner decided. You will be playing against a CPU");
 
        System.out.println("Please enter your name.");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        this.userPlayer = new Player(name);
        this.cpu= new Player("CPU");

      System.out.println(" Goodluck " + name + "!!\n");

       deck = new GroupOfCards();
       deck.shuffleDeck();

        userPlayer.setHand(new Hand());
        cpu.setHand(new Hand());

        dealCards(userPlayer.getHand());
        dealCards(cpu.getHand());

        System.out.printf("%-20s %-20s %-20s %-20s %s \n \n", name, "#CardsInHand ","CPU", "#CardsInHand", "Round Winner");

        int maxRounds = 25;
        Player winner = null;
        while (battle(userPlayer, cpu, null)) {
            maxRounds--;

            if (userPlayer.getHand().handSize() == 0) {


                winner = cpu;
                break;
            } else if (cpu.getHand().handSize() == 0) {

                winner = userPlayer;
                break;
            }

            if (maxRounds < 0) {
                break;
            }
        }

        if (winner != null) {

        } else if (userPlayer.getHand().handSize() > cpu.getHand().handSize()) {
            winner = userPlayer;
        } else if (cpu.getHand().handSize() > userPlayer.getHand().handSize()) {
            winner = cpu;
        } else {

              System.out.printf(" Draw!!");
            return;
        }
         System.out.printf("The winner of the game is %s!", name);
    }

    public void dealCards(Hand hand) {
        for (int i = 0; i < 26; i++) {
            hand.addCard(deck.dealCard());
        }
    }
    public boolean battle(Player playerOne, Player CPU, Hand Deck) {
        
        Card playerOneFaceUp = playerOne.getHand().removeCard();
        if (playerOneFaceUp == null) {
            return false;
        }

        Card playerTwoFaceUp = CPU.getHand().removeCard();
        if (playerTwoFaceUp == null) {
            return false;
        }
        if (Deck == null) {
            Deck = new Hand();
        }
        Deck.addCard(playerOneFaceUp);
        Deck.addCard(playerTwoFaceUp);

        int result = playerOneFaceUp.compare(playerTwoFaceUp);
       Player player1 = playerOne;
       Card card1 = playerOneFaceUp;
       Player player2 = CPU;
        Card card2 = playerTwoFaceUp;
        String winner = playerOne.getName();
        switch (result) {
            case 0:
             System.out.println("WAR! There was a tie and War was initiated");
                List<Card> warPlayerOnePot = playerOne.getHand().take(3);
                if (warPlayerOnePot == null) {
                    return false;
                }
                Deck.addCards(warPlayerOnePot);

                List<Card> warCPUDeck = CPU.getHand().take(3);
                if (warCPUDeck == null) {
                    return false;
                }
                Deck.addCards(warCPUDeck);

                return battle(userPlayer, CPU, Deck);
            case 1:
                  userPlayer.getHand().mergeHand(Deck);
                 System.out.printf("%-20s %-20s %-20s %-20s %s is winner.\n", card1.toString(), player1.getHand().handSize(), card2.toString(), player2.getHand().handSize(), winner);
                 
                break;
            case -1:
                CPU.getHand().mergeHand(Deck);
                 System.out.printf("%-20s %-20s %-20s %-20s %s is winner.\n", card1.toString(), player1.getHand().handSize(), card2.toString(), player2.getHand().handSize(), winner);
                 
                break;
        }

        return true;
    }
}