package org.example.LowLevelDesign.SnakeAndLadder;

import org.example.LowLevelDesign.SnakeAndLadder.entity.*;
import org.example.LowLevelDesign.SnakeAndLadder.service.LadderService;
import org.example.LowLevelDesign.SnakeAndLadder.service.SnakeService;
import org.example.LowLevelDesign.SnakeAndLadder.utils.DiceUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GameV2 {

    Board board;
    Queue<Player> playerQueue;
    private Boolean isGameOver;
    Dice dice;
    static int cnt=0;
    LadderService ladderService;
    SnakeService snakeService;

    public GameV2(List<Player> playerList, Board board, Dice dice,List<Ladder> ladderList,List<Snake> snakeList) {
        this.board = board;
        this.playerQueue = new LinkedList<>();
        for (Player player : playerList) {
            playerQueue.add(player);
        }
        this.isGameOver = false;
        this.dice = dice;
        this.snakeService=new SnakeService(snakeList);
        this.ladderService=new LadderService(ladderList);
    }

    public void startGame() {
        while (!isGameOver) {
            cnt++;
            System.out.println(cnt);
            Player player = playerQueue.poll();
            Integer currPos = player.getPos();
            Integer diceRoll = DiceUtils.roll(dice);
            Integer afterDiceRollPos = currPos + diceRoll;
            if (afterDiceRollPos > board.getEnd()) {
                // simply add back the player with old pos only
                playerQueue.add(player);
            } else if (afterDiceRollPos == board.getEnd()) {
                System.out.println("Player " + player.getName() + " has won the game");
                if (playerQueue.size() == 1) {
                    isGameOver = true;
                }
            } else {
                if (snakeService.checkIfposHaveSnake(afterDiceRollPos)) {
                    System.out.println("Player " + player.getName() + " is bitten by snake");
                    afterDiceRollPos = snakeService.getSnakeEndPosition(afterDiceRollPos);
                } else if (ladderService.checkIfposHaveLadder(afterDiceRollPos)) {
                    System.out.println("Player " + player.getName() + " is climbed using ladder");
                    afterDiceRollPos = ladderService.getLadderEndPosition(afterDiceRollPos);
                }
                player.setPos(afterDiceRollPos);
                playerQueue.add(player);
            }
        }
    }


}
