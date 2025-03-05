package lab_2.problem2;

public abstract class Piece {
    protected Position pos;
    public abstract boolean isLegalMove(Position b);
}