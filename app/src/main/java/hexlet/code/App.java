package hexlet.code;

import hexlet.code.base.Cli;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:
                """);

        switch (scanner.nextLine()) {
            case "1" -> Cli.greet();
            case "2" -> EvenGame.run();
            case "0" -> scanner.close();
            default -> throw new Error("Unknown command :(");
        }
    }
}
