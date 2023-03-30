package hexlet.code.games;

import hexlet.code.base.Engine;

import java.util.Random;

public final class EvenGame {
    public static final String GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int EVEN_GAME_MAX_NUMBER = 100;

    public static void start() {
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = new Random().nextInt(EVEN_GAME_MAX_NUMBER) + 1;
            String correctAnswer = isEven(number) ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.run(questionsAndAnswers, GAME_RULES);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
