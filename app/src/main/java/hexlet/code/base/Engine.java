package hexlet.code.base;

import hexlet.code.utilities.ProjectConstants;

import java.util.Scanner;

public class Engine {

    public static void start(String[][] roundsData, String description) {
        System.out.println(description);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ProjectConstants.ROUNDS; i++) {
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
