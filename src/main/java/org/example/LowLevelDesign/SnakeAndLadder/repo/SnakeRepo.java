package org.example.LowLevelDesign.SnakeAndLadder.repo;

import org.example.LowLevelDesign.SnakeAndLadder.entity.Snake;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnakeRepo {

    private Map<Integer, Integer> snakeMap;

    public SnakeRepo(List<Snake> snakeList) {
        snakeMap = new HashMap<>();
        for (Snake snake : snakeList) {
            snakeMap.put(snake.getStartPos(), snake.getEndPos());
        }
    }

    public Map<Integer, Integer> getSnakeMap() {
        return snakeMap;
    }
}
