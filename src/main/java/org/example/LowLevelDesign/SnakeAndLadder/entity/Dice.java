package org.example.LowLevelDesign.SnakeAndLadder.entity;

import lombok.Data;

import java.util.Random;

@Data
public class Dice {

    private int size;

    public Dice(int size) {
        this.size = size;
    }

    public int roll() {
        return new Random().nextInt(this.getSize()) + 1;
    }


}
