package com.AccioJob.dto;

public class Pair {
    public int row;
    public int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public String toString() {
        return "R = " + row + ", C = " + col + "\n";
    }
}
