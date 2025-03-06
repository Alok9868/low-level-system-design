package org.example.LowLevelDesign.ticTacToe.entity;

public class X_Piece implements Piece {

    private final PieceType pieceType;

    public X_Piece() {
        this.pieceType = PieceType.X;
    }

    @Override
    public PieceType getPieceType() {
        return pieceType;
    }
}
