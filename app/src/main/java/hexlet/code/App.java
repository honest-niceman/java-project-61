package hexlet.code;

import hexlet.code.base.Cli;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                           Please enter the game number and press Enter.
                           1 - Greet
                           2 - Even
                           3 - Calc
                           4 - GCD
                           5 - Progression
                           6 - Prime
                           0 - Exit
                           Your choice:
                           """);

        switch (scanner.nextLine()) {
            case "1" -> Cli.greet();
            case "2" -> EvenGame.start();
            case "3" -> CalculatorGame.start();
            case "4" -> GCDGame.start();
            case "5" -> ProgressionGame.start();
            case "6" -> PrimeGame.start();
            case "0" -> scanner.close();
            default -> throw new Error("Unknown command :(");
        }
    }
}
