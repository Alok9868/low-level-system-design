package org.example.LowLevelDesign.SnakeAndLadder.service;

import org.example.LowLevelDesign.SnakeAndLadder.entity.Snake;
import org.example.LowLevelDesign.SnakeAndLadder.repo.SnakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnakeService {

    @Autowired
    SnakeRepo snakeRepo;

    public SnakeService(List<Snake> snakeList) {
        this.snakeRepo = new SnakeRepo(snakeList);
    }


    public int getSnakeEndPosition(int pos) {
        return snakeRepo.getSnakeMap().get(pos);
    }

    public Boolean checkIfposHaveSnake(int pos) {
        if (snakeRepo.getSnakeMap().containsKey(pos)) {
            return true;
        }
        return false;
    }

}
