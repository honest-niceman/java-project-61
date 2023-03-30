package hexlet.code.base;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    public static void run(String[][] roundsData, String description) {
        System.out.println(description);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ROUNDS; i++) {
            String question = roundsData[i][0];
            String rightAnswer = roundsData[i][1];
            System.out.println("Question: " + question);

            String answer = scanner.next();

            if (answer.equals(roundsData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(\nCorrect answer was '%s'.\nLet's try again!%n",
                                  answer,
                                  rightAnswer);
                return;
            }
        }

        System.out.println("Congratulations!");
        scanner.close();
    }
}
