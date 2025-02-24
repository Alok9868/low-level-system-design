package org.example.LowLevelDesign.SnakeAndLadder.entity;

import lombok.Data;

@Data
public class Player {
    int id;
    String name;
    int pos;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.pos = 1;
    }
}
