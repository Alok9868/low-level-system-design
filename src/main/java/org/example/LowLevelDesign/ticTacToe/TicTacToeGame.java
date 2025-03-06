package org.example.LowLevelDesign.ticTacToe;

import lombok.Builder;
import lombok.Data;
import org.example.LowLevelDesign.ticTacToe.entity.Board;
import org.example.LowLevelDesign.ticTacToe.entity.Players;

import java.util.*;

@Data
@Builder
public class TicTacToeGame {

    Queue<Players> playersQueue;
    Board board;
    Boolean isGameOver;

    public void intializeGame(Board board, List<Players> playersList) {
        playersQueue = new LinkedList<>();
        this.board = board;
        this.isGameOver = false;
        for (Players players : playersList) {
            playersQueue.add(players);
        }
    }


    private List<Integer> takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int row = scanner.nextInt();
        while (row < 0 || row >= board.getTotalRow()) {
            System.out.println("You have entered the wrong row number , please enter again:");
            row = scanner.nextInt();
        }
        System.out.println("Enter the col number: ");
        int col = scanner.nextInt();
        while (col < 0 || col >= board.getTotalCol()) {
            System.out.println("You have entered the wrong col number , please enter again:");
            col = scanner.nextInt();
        }
        return Arrays.asList(row, col);
    }

    public void startGame() {
        while (!isGameOver) {

            board.printBoard();

            Players currPlayer = playersQueue.poll();
            // enter the pos in row and col in matrix
            Boolean validInput = false;
            while (!validInput) {
                System.out.println("Player : " + currPlayer.getName() + "Enter your inputs");
                List<Integer> inputList = takeInput();

                int row = inputList.get(0);
                int col = inputList.get(1);

                // check if the pos is empty or not
                Boolean isPosEmpty = board.checkIfPosIsEmpty(row, col);
                if (isPosEmpty) {
                    // set the curr pos in board
                    board.setPosInBoard(row, col, currPlayer.getPiece().getPieceType());

                    validInput = true;

                    // if player wins - write the condition here.
                    if (board.checkIfPlayerWins(currPlayer, row, col)) {
                        System.out.println("Player" + currPlayer.getName() + "wins!");
                        isGameOver = true;
                        return;
                    }
                } else {
                    validInput = false;
                    System.out.println("position is already filled , Enter the input again:");
                }
            }
            // if size is full - print that the game is tied .
            if (board.getIsFull()) {
                System.out.println("Match tied , no one wins");
                isGameOver = true;
            }
            playersQueue.add(currPlayer);
        }
    }


}
