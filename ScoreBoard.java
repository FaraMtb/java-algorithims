package com.ematrix;

public class ScoreBoard {

    private int scoreEntries = 0;
    private GameEntry[] board;


    public ScoreBoard(int boardSize){
        board=new GameEntry[boardSize];

    }

    public GameEntry[] getBoard() {
        return board;
    }

    public void addScoreToBoard(GameEntry newScoreEntry) {
        int newScore = newScoreEntry.getPlayerScore( );
        if (scoreEntries < board.length || newScore > board[scoreEntries-1].getPlayerScore( )) {
            if (scoreEntries < board.length) // no score drops from the board
                scoreEntries++;
            int j = scoreEntries - 1;
            while (j > 0 && this.board[j - 1].getPlayerScore() < newScore) {
                board[j] = this.board[j - 1]; // shift entry from j-1 to j
                j--; // and decrement j
            }
            board[j] = newScoreEntry;
        }
    }

    public GameEntry removeScoreToBoard(int scoreIndex) throws IndexOutOfBoundsException {
        if(scoreIndex>this.scoreEntries-1){
            throw new IndexOutOfBoundsException("Invalid index: " + scoreIndex);
        }
        int j=scoreIndex;
        GameEntry temp=this.board[j];
        for(;j<scoreEntries-1;j++){
            this.board[j] = this.board[j + 1];
        }
        this.board[j]=null;
        scoreEntries--;
        return temp;
    }


    public int getScoreEntries() {
        return scoreEntries;
    }
}

