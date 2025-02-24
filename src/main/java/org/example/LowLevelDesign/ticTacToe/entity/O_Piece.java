package org.example.LowLevelDesign.ticTacToe.entity;

import org.example.LowLevelDesign.ticTacToe.PieceType;

public class O_Piece implements Piece {

    private final PieceType pieceType;

    public O_Piece() {
        this.pieceType = PieceType.O;
    }

    @Override
    public PieceType getPieceType() {
        return pieceType;
    }
}
