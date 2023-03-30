package hexlet.code.base;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nHow can I call you?\n");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        scanner.close();
    }
}
