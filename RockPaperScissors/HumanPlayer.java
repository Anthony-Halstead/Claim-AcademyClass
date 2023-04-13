package RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

public class HumanPlayer implements Player {
    private String name;
    private ConsoleIO io;
    private List<String> actionMenu;
    private static final int CHOICE_PAPER = 1;
    private static final int CHOICE_ROCK = 2;
    private static final int CHOICE_SCISSORS = 3;

    public HumanPlayer(String name, ConsoleIO io) {
        this.name = name;
        this.io = io;

        actionMenu = new ArrayList<>();
        actionMenu.add("Paper");
        actionMenu.add("Rock");
        actionMenu.add("Scissors");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public RockPaperScissorsAction getAction() {
        RockPaperScissorsAction result = null;

        while (result == null) {
            io.displayMessage(getName() + ", select an action");
            int choice = io.displayMenuAndGetChoice(actionMenu);

            switch (choice) {
                case CHOICE_PAPER:
                    result = RockPaperScissorsAction.PAPER;
                    break;
                case CHOICE_ROCK:
                    result = RockPaperScissorsAction.ROCK;
                    break;
                case CHOICE_SCISSORS:
                    result = RockPaperScissorsAction.SCISSORS;
                    break;
                default:
                    io.displayError("Invalid input.");
            }
        }

        return result;
    }
}
