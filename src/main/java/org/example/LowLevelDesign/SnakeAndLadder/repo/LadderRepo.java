package org.example.LowLevelDesign.SnakeAndLadder.repo;


import org.example.LowLevelDesign.SnakeAndLadder.entity.Ladder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LadderRepo {

   public Map<Integer, Integer> ladderMap;

    public LadderRepo(List<Ladder> ladderList) {
        ladderMap = new HashMap<>();
        for (Ladder ladder : ladderList) {
            ladderMap.put(ladder.getStartPos(), ladder.getEndPos());
        }
    }

    public Map<Integer, Integer> getLadderMap() {
        return ladderMap;
    }
}
