package com.example.methodchallenge;

public class Main {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Dipak", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Rosan", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sita", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Rohit", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Dipak", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
        int position =4;
        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500) {
            position =2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }
}
