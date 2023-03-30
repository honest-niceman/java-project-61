package hexlet.code.games;

import hexlet.code.base.Engine;

import java.util.Random;

public class ProgressionGame {
    public static final int MIN_LENGTH = 5;
    public static final int MAX_LENGTH = 10;
    public static final int MAX_STEP = 5;
    public static final int MAX_START_NUMBER = 20;
    public static final String GAME_RULES = "What number is missing in the progression?";
    public static final int QUESTION_AND_ANSWER = 2;

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][QUESTION_AND_ANSWER];

        Random random = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int startNumber = random.nextInt(MAX_START_NUMBER) + 1;
            int progressionLength = MIN_LENGTH + random.nextInt(MAX_LENGTH - MIN_LENGTH + 1);
            int step = random.nextInt(MAX_STEP) + 2;
            int questionIdx = random.nextInt(progressionLength);

            var progressionItems = getProgression(startNumber, step, progressionLength);

            questionsAndAnswers[i][1] = progressionItems[questionIdx];
            progressionItems[questionIdx] = "..";
            questionsAndAnswers[i][0] = String.join(" ", progressionItems);
        }

        Engine.run(questionsAndAnswers, GAME_RULES);
    }

    private static String[] getProgression(int startNumber, int step, int progressionLength) {
        String[] progressionItems = new String[progressionLength];

        for (var i = 0; i < progressionLength; i++) {
            progressionItems[i] = String.valueOf(startNumber);
            startNumber = startNumber + step;
        }

        return progressionItems;
    }
}
