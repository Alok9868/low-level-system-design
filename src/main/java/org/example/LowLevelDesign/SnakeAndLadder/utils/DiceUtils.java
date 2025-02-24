package org.example.LowLevelDesign.SnakeAndLadder.utils;

import org.example.LowLevelDesign.SnakeAndLadder.entity.Dice;

import java.util.Random;

public class DiceUtils {

    private DiceUtils() { } // Prevent instantiation

    public static int roll(Dice dice) {
        return new Random().nextInt(dice.getSize()) + 1;
    }

}
