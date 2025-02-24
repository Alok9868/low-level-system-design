package org.example.LowLevelDesign.ticTacToe;

import org.example.LowLevelDesign.ticTacToe.entity.Board;
import org.example.LowLevelDesign.ticTacToe.entity.O_Piece;
import org.example.LowLevelDesign.ticTacToe.entity.Players;
import org.example.LowLevelDesign.ticTacToe.entity.X_Piece;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Players players1 = Players.builder()
                .name("alok")
                .piece(new X_Piece())
                .build();


        Players players2 = Players.builder()
                .name("deepanshu")
                .piece(new O_Piece())
                .build();

        List<Players> playersList = Arrays.asList(players1, players2);

        int row = 3;
        int col = 3;
        PieceType[][] board = new PieceType[row][col];
        Board ticTacToeBoard = Board.builder()
                .board(board)
                .totalRow(row)
                .totalCol(col)
                .isFull(false)
                .totalSize(row * col)
                .build();

        TicTacToeGame ticTacToeGame = TicTacToeGame.builder().build();
        ticTacToeGame.intializeGame(ticTacToeBoard, playersList);
        ticTacToeGame.startGame();


    }
}
