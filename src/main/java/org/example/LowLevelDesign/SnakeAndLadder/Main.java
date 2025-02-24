package org.example.LowLevelDesign.SnakeAndLadder;

import org.example.LowLevelDesign.SnakeAndLadder.entity.*;

import java.util.Arrays;
import java.util.List;

public class Main {


    // snakeMap - for storing the starting and ending pos of snake
    // LadderMap - for storing the starting and ending pos of ladder

    // 20 - 10 . starting pos is , and ending pos is 10
    // 12 - 25 - starting pos is 12 and ending pos is 25


    // we can have check that in snake the pos is always in decreasing mode
    // in ladder map we can have check that the pos is always in increasing mode


    public static void main(String[] args) {


        Snake snake1 = new Snake(10, 5);
        Snake snake2 = new Snake(23, 2);
        Snake snake3 = new Snake(56, 25);
        Snake snake4 = new Snake(79, 4);

        Ladder ladder1 = new Ladder(8, 67);
        Ladder ladder2 = new Ladder(45, 89);

        Ladder ladder3 = new Ladder(65, 90);
        Ladder ladder4 = new Ladder(75, 99);

        List<Snake> snakeList = Arrays.asList(snake1, snake2, snake3, snake4);
        List<Ladder> ladderList = Arrays.asList(ladder1, ladder2, ladder3, ladder4);

        Player player1 = new Player(1, "alok");
        Player player2 = new Player(2, "deepanshu");

        List<Player> playerList = Arrays.asList(player1, player2);
        Board board = new Board(100);

        // this is the version 1 with simple code
        GameV1 game = new GameV1(playerList, snakeList, ladderList, board);
//        game.startGame();


        // this is version 2 with repo and service classes.
        GameV2 gamev2 = new GameV2(playerList, board, new Dice(6), ladderList, snakeList);
        gamev2.startGame();


    }
}
