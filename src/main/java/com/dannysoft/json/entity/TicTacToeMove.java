package com.dannysoft.json.entity;

public class TicTacToeMove {

    String move;
    Integer turn;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


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
        return "TicTacToeMove{" + "move='" + move + '\'' + ", turn=" + turn + ", type='" + type + '\'' + '}';
    }
}
