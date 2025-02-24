package org.example.LowLevelDesign.ticTacToe.entity;

import lombok.Builder;
import lombok.Data;
import org.example.LowLevelDesign.ticTacToe.PieceType;

@Data
@Builder
public class Board {

    public PieceType[][] board;
    int totalSize;
    int currSize;
    int totalRow;
    int totalCol;
    Boolean isFull = false;


    public Boolean checkIfPosIsEmpty(int row, int col) {
        if (board[row][col] == null) {
            return true;
        }
        return false;
    }

    public Boolean checkIfInputValid(int row, int col) {

        if (row < 0 || row >= totalRow || col < 0 || col >= totalCol) {
            return false;
        }
        return true;

    }

    public void setPosInBoard(int row, int col, PieceType pieceType) {
        board[row][col] = pieceType;
        currSize++;
        if (currSize == totalSize) {
            isFull = true;
        }
    }

//

    /// /    |   X   |
//      |   0   |
//      |   0   0
    public void printBoard() {
        for (int i = 0; i < totalRow; i++) {
            for (int j = 0; j < totalCol; j++) {
                if (board[i][j] == null) {
                    System.out.print(" | ");

                } else {
                    System.out.print(" " + board[i][j] + " ");
                }
            }
            System.out.println();
        }

    }


    public Boolean checkIfPlayerWins(Players player, int row, int col) {

        // first check if the curr row have same symbol in all cols
        PieceType currPiece = board[row][col];
        int currCol;
        for (currCol = 0; currCol < totalCol; currCol++) {
            if (board[row][currCol] != currPiece) {
                break;
            }
        }
        if (currCol == totalCol) {
            return true;
        }

        int currRow;
        for (currRow = 0; currRow < totalRow; currRow++) {
            if (board[currRow][col] != currPiece) {
                break;
            }
        }

        if (currRow == totalRow) {
            return true;
        }

        for (currRow = 0, currCol = 0; currRow < totalRow && currCol < totalCol; currRow++, currCol++) {
            if (board[currRow][currCol] != currPiece) {
                break;
            }
        }

        if (currRow == totalRow && currCol == totalCol) {
            return true;
        }

        for (currRow = 0, currCol = totalCol - 1; currRow < totalRow && currCol >= 0; currRow++, currCol--) {
            if (board[currRow][currCol] != currPiece) {

                break;

            }
        }


        if (currRow == totalRow && currCol == -1) {
            return true;
        }

        return false;
    }

}
