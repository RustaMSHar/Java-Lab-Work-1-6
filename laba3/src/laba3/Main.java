package laba3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] board = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 13, 14, 15, 12};
        Fifteen position = new Fifteen(board);
        System.out.println("Possible moves:");
        for (Fifteen move : position.generateMoves()) {
            System.out.println(Arrays.toString(move.getBoard()) + " - evaluation: " + move.evaluate());
        }
    }
}

