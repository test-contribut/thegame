package com.dannysoft.json.entity;

public class TicTacToeMove {

    String move;
    Integer turn;

    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }


    @Override
    public String toString() {
        return "TicTacToeMove{" +
                "move='" + move + '\'' +
                ", turn=" + turn +
                '}';
    }
}
