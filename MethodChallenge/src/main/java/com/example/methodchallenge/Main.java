package com.example.methodchallenge;


//Create a method called displayHighScorePosition
//It should a players name as a parameter, and a 2nd parameter as a position in the high score table
//You should display the player's name along with a message like " managed to get into position " and the position they got
// and a further message "on high score table".
//Create a 2nd method called calculateHighScorePosition
//It should be sent one argument only, the player score
//It should return an int
//The return data should be
//1 If score is >1000
//2 If the score is >500 and <1000
//3 If the score is >100 and <500
//4 in all other cases
//call both methods and display the results of the following
//a score of 1500,900, 400 and 50

public class Main {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Dipak",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Rosan", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Pawan", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Nikesh", highScorePosition);


    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position "+position+" on high score table.");
    }
    public static int calculateHighScorePosition(int score){
//        if (score > 1000){
//            return 1;
//        } else if (score > 500 && score < 1000) {
//            return 2;
//        } else if (score > 100 && score <500) {
//            return 3;
//        }else {
//            return 4;
//        }
        int position = 4;
        if (score >= 1000){
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } return position;
    }
}

