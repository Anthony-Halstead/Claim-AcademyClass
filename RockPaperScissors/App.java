package RockPaperScissors;

public class App {
    public static void main(String[] args) {
        ConsoleIO io = new ConsoleIO();
        RockPaperScissorsGame game = new RockPaperScissorsGame(io);

        MenuController menu = new MenuController(io, game);

        menu.run();
    }
}
