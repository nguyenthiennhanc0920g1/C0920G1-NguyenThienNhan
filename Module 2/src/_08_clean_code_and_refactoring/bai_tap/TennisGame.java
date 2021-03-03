package _08_clean_code_and_refactoring.bai_tap;

public class TennisGame {

    public static final int mileStones = 4;

    public static String getScore(String playerOneName, String playerTwoName, int scorePlayerOne, int scorePlayerTwo) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        boolean drawScore = scorePlayerOne == scorePlayerTwo;
        if (drawScore) {
            score = getStringBuilder(scorePlayerOne);
        } else {
            boolean winScore = scorePlayerOne >= mileStones || scorePlayerTwo >= mileStones;
            if (winScore) {
                score = getStringBuilder(scorePlayerOne, scorePlayerTwo);
            } else {
                getStringBuilder(scorePlayerOne, scorePlayerTwo, score);
            }
        }
        return score.toString();
    }

    private static void getStringBuilder(int scorePlayerOne, int scorePlayerTwo, StringBuilder score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayerOne;
            else {
                score.append("-");
                tempScore = scorePlayerTwo;
            }
            switch (tempScore) {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
            }
        }
    }

    private static StringBuilder getStringBuilder(int scorePlayerOne, int scorePlayerTwo) {
        StringBuilder score;
        int minusResult = scorePlayerOne - scorePlayerTwo;
        if (minusResult == 1) score = new StringBuilder("Advantage player1");
        else if (minusResult == -1) score = new StringBuilder("Advantage player2");
        else if (minusResult >= 2) score = new StringBuilder("Win for player1");
        else score = new StringBuilder("Win for player2");
        return score;
    }

    private static StringBuilder getStringBuilder(int scorePlayerOne) {
        StringBuilder score;
        switch (scorePlayerOne) {
            case 0:
                score = new StringBuilder("Love-All");
                break;
            case 1:
                score = new StringBuilder("Fifteen-All");
                break;
            case 2:
                score = new StringBuilder("Thirty-All");
                break;
            case 3:
                score = new StringBuilder("Forty-All");
                break;
            default:
                score = new StringBuilder("Deuce");
                break;

        }
        return score;
    }
}
