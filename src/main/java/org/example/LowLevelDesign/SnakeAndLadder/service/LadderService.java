package org.example.LowLevelDesign.SnakeAndLadder.service;

import org.example.LowLevelDesign.SnakeAndLadder.entity.Ladder;
import org.example.LowLevelDesign.SnakeAndLadder.repo.LadderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LadderService {

    @Autowired
    LadderRepo ladderRepo;

    public int getLadderEndPosition(int pos) {
        return ladderRepo.getLadderMap().get(pos);

    }

    public Boolean checkIfposHaveLadder(int pos) {
        if (ladderRepo.getLadderMap().containsKey(pos)) {
            return true;
        }
        return false;
    }

    public LadderService(List<Ladder> ladderList) {
        this.ladderRepo = new LadderRepo(ladderList);
    }

}
