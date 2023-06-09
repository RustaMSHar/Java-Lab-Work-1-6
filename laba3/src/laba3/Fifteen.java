package laba3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fifteen {
    private int[] board;
    private int emptyIndex;

    public Fifteen(int[] board) {
        this.board = board.clone();
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 0) {
                emptyIndex = i;
                break;
            }
        }
    }

    public List<Fifteen> generateMoves() {
        List<Fifteen> moves = new ArrayList<>();
        int x = emptyIndex % 4;	
        int y = emptyIndex / 4;
        if (x > 0) {
            moves.add(makeMove(emptyIndex - 1));
        }
        if (x < 3) {
            moves.add(makeMove(emptyIndex + 1));
        }
        if (y > 0) {
            moves.add(makeMove(emptyIndex - 4));
        }
        if (y < 3) {
            moves.add(makeMove(emptyIndex + 4));
        }
        return moves;
    }

    public int evaluate() {
        int sum = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != 0 && board[i] != i + 1) {
                sum++;
            }
        }
        return sum;
    }

    private Fifteen makeMove(int index) {
        int[] newBoard = board.clone();
        newBoard[emptyIndex] = board[index];
        newBoard[index] = 0;
        return new Fifteen(newBoard);
    }

    public int[] getBoard() {
        return board.clone();
    }
}
