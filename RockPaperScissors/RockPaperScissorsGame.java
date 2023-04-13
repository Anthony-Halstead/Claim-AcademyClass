package RockPaperScissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissorsGame {
    private ConsoleIO io;
    private List<String> playerSelectionMenu;
    private static final int CHOICE_PLAYER = 1;
    private static final int CHOICE_COMPUTER = 2;
    private static int playerOneScore = 0;
    private static int playerTwoScore = 0;

    public RockPaperScissorsGame(ConsoleIO io) {
        this.io = io;
        playerSelectionMenu = new ArrayList<>();
        playerSelectionMenu.add("Human");
        playerSelectionMenu.add("Computer");
    }

    public void run() {
        Player playerA;
        Player playerB;

     

        playerA = choosePlayer();
        playerB = choosePlayer();

        RockPaperScissorsAction a = playerA.getAction();
        io.displayMessage(playerA.getName() + " chose " + a);

        RockPaperScissorsAction b = playerB.getAction();
        io.displayMessage(playerB.getName() + " chose " + b);

        displayAndReturnResults(playerA, a, playerB, b);
        System.out.println("Player One Score: "+playerOneScore);
        System.out.println("Player Two Score: " + playerTwoScore);
        boolean playAgain = true;
        while(playAgain){
           
            System.out.println("Do you want to play again? ");
            System.out.println("\n If yes: enter [1] \n If no: enter [2] ");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            if(value == 1){
                repeat(playerA, playerB);
            }
            if(value == 2){
                playAgain = false;
                
            }            
        }
        
    }
    public void repeat(Player playerA, Player playerB) {
        //int playerCount = 0;
        //int aiCount = 0;
       
        RockPaperScissorsAction a = playerA.getAction();
        io.displayMessage(playerA.getName() + " chose " + a);

        RockPaperScissorsAction b = playerB.getAction();
        io.displayMessage(playerB.getName() + " chose " + b);

        displayAndReturnResults(playerA, a, playerB, b);
    }

    private Player choosePlayer() {
        Player player = null;

        while (player == null) {
            int choice = io.displayMenuAndGetChoice(playerSelectionMenu);

            switch (choice) {
                case CHOICE_PLAYER:
                    String name = io.getString("Player name");
                    player = new HumanPlayer(name, io);
                    break;
                case CHOICE_COMPUTER:
                    player = new ComputerPlayer();
                    break;
                default:
                    io.displayError("Invalid selection");
            }
        }

        return player;
    }


     private void displayAndReturnResults(Player playerA, RockPaperScissorsAction a, Player playerB, RockPaperScissorsAction b) {
        if (a == b) {
            io.displayTitle("It's a tie!");
            return;
        }

        // paper beats rock
        if ((a == RockPaperScissorsAction.PAPER && b == RockPaperScissorsAction.ROCK)
            || (b == RockPaperScissorsAction.PAPER && a == RockPaperScissorsAction.ROCK)
        ) {
            if (a == RockPaperScissorsAction.PAPER) {
                io.displayTitle(playerA.getName() + " Wins!!");
                playerOneScore++;
            } else {
                io.displayTitle(playerB.getName() + " Wins!");
                playerTwoScore++;
            }
            return;
        }

        // rock beats scissors
        if ((a == RockPaperScissorsAction.SCISSORS && b == RockPaperScissorsAction.ROCK)
                || (b == RockPaperScissorsAction.SCISSORS && a == RockPaperScissorsAction.ROCK)
        ) {
            if (a == RockPaperScissorsAction.ROCK) {
                io.displayTitle(playerA.getName() + " Wins!!");
                playerOneScore++;
            } else {
                io.displayTitle(playerB.getName() + " Wins!");
                playerTwoScore++;
            }
            return;
        }

        // scissors beat paper
        if ((a == RockPaperScissorsAction.SCISSORS && b == RockPaperScissorsAction.PAPER)
                || (b == RockPaperScissorsAction.SCISSORS && a == RockPaperScissorsAction.PAPER)
        ) {
            if (a == RockPaperScissorsAction.SCISSORS) {
                io.displayTitle(playerA.getName() + " Wins!!");
                playerOneScore++;
            } else {
                io.displayTitle(playerB.getName() + " Wins!");
                playerTwoScore++;
            }
            return;
        }
    }
}
