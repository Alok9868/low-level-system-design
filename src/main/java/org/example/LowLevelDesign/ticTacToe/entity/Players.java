package org.example.LowLevelDesign.ticTacToe.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Players {

    String name;

    Piece piece;

}
