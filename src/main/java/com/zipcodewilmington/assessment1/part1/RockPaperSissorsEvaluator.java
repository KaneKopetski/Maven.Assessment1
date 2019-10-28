package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningMove = "";
        if (handSign.equals("rock")) {
            winningMove = "paper";
        } else if (handSign.equals("paper")) {
            winningMove = "scissor";
        } else {
            winningMove = "rock";
        }
            return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String winningMove = "";
        if (handSign.equals("rock")) {
            winningMove = "scissor";
        } else if (handSign.equals("paper")) {
            winningMove = "rock";
        } else {
            winningMove = "paper";
        }
        return winningMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        String winningmove = getWinningMove(handSignOfPlayer1);

        if (handSignOfPlayer2.equals(winningmove)) {
            winner = handSignOfPlayer2;
        } else {
            winner = handSignOfPlayer1;
        }

        return winner;
    }
}
