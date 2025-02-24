package org.example.LowLevelDesign.SnakeAndLadder.entity;

import lombok.Data;

@Data
public class Snake {

    int startPos;
    int endPos;

    public Snake(int start, int end) {
        if (end >= start) {
            throw new IllegalArgumentException("Snake end must be less than start");
        }
        this.startPos = start;
        this.endPos = end;
    }


}
