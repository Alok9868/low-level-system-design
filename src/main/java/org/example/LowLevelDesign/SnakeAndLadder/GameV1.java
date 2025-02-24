package org.example.LowLevelDesign.SnakeAndLadder;

import org.example.LowLevelDesign.SnakeAndLadder.entity.*;

import java.util.*;

public class GameV1 {

    Board board;
    Queue<Player> playerQueue;
    private Map<Integer, Integer> snakeMap;
    private Map<Integer, Integer> ladderMap;
    private Boolean isGameOver;
    Dice dice;
    private static int cnt = 0;

    public GameV1(List<Player> playerList, List<Snake> snakeList, List<Ladder> ladderList, Board board) {
        this.board = board;
        this.isGameOver = false;
        this.snakeMap = new HashMap<>();
        this.ladderMap = new HashMap<>();
        this.playerQueue = new LinkedList<>();
        this.dice = new Dice(6);
        cnt = 0;
        for (Player player : playerList) {
            playerQueue.add(player);
        }

        for (Snake snake : snakeList) {
            snakeMap.put(snake.getStartPos(), snake.getEndPos());
        }

        for (Ladder ladder : ladderList) {
            ladderMap.put(ladder.getStartPos(), ladder.getEndPos());
        }
    }

    public void startGame() {
        while (!isGameOver) {
            System.out.println(cnt);
            Player player = playerQueue.poll();
            Integer currPos = player.getPos();
            Integer diceRoll = dice.roll();
            Integer afterDiceRollPos = currPos + diceRoll;
            if (afterDiceRollPos > board.getEnd()) {
                // simply add back the player with old pos only
                playerQueue.add(player);
            } else if (afterDiceRollPos == board.getEnd()) {
                System.out.println("Player" + player.getName() + "has won the game");
                if (playerQueue.size() == 1) {
                    isGameOver = true;
                }
            } else {
                if (snakeMap.containsKey(afterDiceRollPos)) {
                    System.out.println("Player" + player.getName() + "is bitten by snake");
                    afterDiceRollPos = snakeMap.get(afterDiceRollPos);
                } else if (ladderMap.containsKey(afterDiceRollPos)) {
                    System.out.println("Player" + player.getName() + "is climbed using ladder");
                    afterDiceRollPos = ladderMap.get(afterDiceRollPos);
                }
                player.setPos(afterDiceRollPos);
                playerQueue.add(player);
            }
            cnt++;
        }

    }

}
