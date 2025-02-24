package org.example.LowLevelDesign.SnakeAndLadder.entity;

import lombok.Data;

@Data
public class Ladder {

    int startPos;
    int endPos;

    public Ladder(int start, int end) {
        if (start >= end) {
            throw new IllegalArgumentException("Ladder start must be greater than end");
        }
        this.startPos = start;
        this.endPos = end;
    }

}
