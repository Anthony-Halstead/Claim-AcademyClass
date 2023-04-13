package RockPaperScissors;

import java.util.List;
import java.util.Scanner;

public class ConsoleIO {
    // Display a title
    public void displayTitle(String title) {
        displayMessage("================================");
        displayMessage(title);
        displayMessage("================================");
    }

    public void prompt(String prompt) {
        System.out.print(prompt + ": ");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayError(String error) {
        displayMessage("********* " + error + " *********");
    }

    // Get integer
    public int getInteger(String prompt) {
        boolean running = true;
        int result = 0;
        while (running) {
            Scanner scanner = new Scanner(System.in);
            prompt(prompt);

            try {
                 result = Integer.parseInt(scanner.nextLine());
                 running = false;
            } catch (Exception e) {
                displayError("Please input a valid number");
            }
        }

        return result;
    }

    public int getIntegerInRange(String prompt, int min, int max) {
        boolean running = true;
        int input = -1;

        while (running) {
            input = getInteger(prompt + "(" + min + " - " + max + ")");
            if (input >= min && input <= max) {
                running = false;
            } else {
                displayError("Invalid input:  Range is " + min + " - " + max);
            }
        }

        return input;
    }

    public String getString(String prompt) {
        prompt(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // Display a menu
    public int displayMenuAndGetChoice(List<String> menu) {
        for (int i = 0; i < menu.size(); i++) {
            displayMessage((i + 1) + ": " + menu.get(i));
        }

        return getIntegerInRange("Enter Choice", 1, menu.size());
    }

    public void displayTodoItems(List<String> todos) {
        displayMessage("");
        displayTitle("Things To Do");
        for (int i = 0; i < todos.size(); i++) {
            displayMessage(i + ": " + todos.get(i));
        }
        displayMessage("");
    }
}
