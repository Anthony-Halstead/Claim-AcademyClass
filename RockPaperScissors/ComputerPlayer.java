package RockPaperScissors;

import java.util.Random;

public class ComputerPlayer implements Player {
    int gameNumber = 0;
    @Override
    public String getName() {
        return "Marvin";
    }

    @Override
    public RockPaperScissorsAction getAction() {
        Random rng = new Random();
        int choice = rng.nextInt(3) + 1;

        switch (choice) {
            case 1:
                return RockPaperScissorsAction.ROCK;
            case 2:
                return RockPaperScissorsAction.PAPER;
            case 3:
                return RockPaperScissorsAction.SCISSORS;
        }
     

        System.err.println("SOMETHING VERY WRONG JUST HAPPENED HERE");
        return RockPaperScissorsAction.ROCK;
    }


    public RockPaperScissorsAction getPatternAction(){
        
        int choice = gameNumber+1;

        switch (choice) {
            case 1:
                gameNumber++;
                return RockPaperScissorsAction.ROCK;
            case 2:
                gameNumber++;
                return RockPaperScissorsAction.PAPER;
            case 3:
                gameNumber++;
                return RockPaperScissorsAction.SCISSORS;
            case 4:
                gameNumber++;
            return RockPaperScissorsAction.SCISSORS;
            case 5:
                gameNumber++;
                return RockPaperScissorsAction.PAPER;
            case 6:
                gameNumber = 0;
                return RockPaperScissorsAction.ROCK;
    }
    System.err.println("SOMETHING VERY WRONG JUST HAPPENED HERE");
    return RockPaperScissorsAction.ROCK;
}

public RockPaperScissorsAction getRandomThenPlayerAction() {
Random rng = new Random();
int choice = rng.nextInt(3) + 1;

switch (choice) {
    case 1:
    gameNumber++;
        return RockPaperScissorsAction.ROCK;
    case 2:
    gameNumber++;
        return RockPaperScissorsAction.PAPER;
    case 3:
    gameNumber++;
        return RockPaperScissorsAction.SCISSORS;
}
if(gameNumber>0)
{
    //Get the choice the player chose from the rock paper scissors game class
   
}
   
}

}
