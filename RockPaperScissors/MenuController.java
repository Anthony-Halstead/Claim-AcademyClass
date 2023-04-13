package RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

public class MenuController {
    private ConsoleIO io;
    private RockPaperScissorsGame game;
    private List<String> menuItems;

    private static final int CHOICE_START_GAME = 1;
    private static final int CHOICE_EXIT = 2;

    public MenuController(ConsoleIO io, RockPaperScissorsGame game) {
        this.io = io;
        this.game = game;

        menuItems = new ArrayList<>();
        menuItems.add("Start New Game");
        menuItems.add("Exit");
    }

    public void run() {
        boolean running = true;

        io.displayTitle("Paper, Rock, Scissors");

        while (running) {
            int choice = io.displayMenuAndGetChoice(menuItems);

            switch (choice) {
                case CHOICE_START_GAME:
                    game.run();
                    break;
                case CHOICE_EXIT:
                    io.displayError("Goodbye!");
                    return;
                default:
                    io.displayError("Invalid choice");
            }
        }
    }
}
