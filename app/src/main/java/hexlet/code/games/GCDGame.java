package hexlet.code.games;

import hexlet.code.base.Engine;

import java.util.Random;

public final class GCDGame {
    public static final int MAX_NUMBER = 100;
    public static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = random.nextInt(MAX_NUMBER) + 1;
            int secondNumber = random.nextInt(MAX_NUMBER) + 1;

            String question = firstNumber + " " + secondNumber;
            String correctAnswer = String.valueOf(calculate(firstNumber, secondNumber));

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.run(questionsAndAnswers, GAME_RULES);
    }

    private static int calculate(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}

