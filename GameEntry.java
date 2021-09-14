package com.ematrix;

public class GameEntry {
    private int playerScore=0;
    private String playerName="";

    public GameEntry(String newPlayerName, int newPlayerScore) {
        playerScore= newPlayerScore;
        playerName=newPlayerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }
}
