package com.erikdjamgarian;

import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {
	    calculateScore(true, 800, 5, 10);

	    calculateScore(true, 10000, 8, 200);

	    int highScorePosition = calculateHighScorePosition(1000);
	    displayHighScorePosition("Franko", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Ascne", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Ronda", highScorePosition);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                            + highScorePosition + " on the high score position");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;

    }



}



