package org.example.LowLevelDesign.SnakeAndLadder.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Board {

    int size;
    int start;
    int end;

    public Board(int size) {
        this.start = 1;
        this.end = size;
        this.size=size;
    }

}
