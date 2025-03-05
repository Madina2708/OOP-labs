package lab_2.problem2.figures;

import lab_2.problem2.Piece;
import lab_2.problem2.Position;

public class Pawn extends Piece {
    @Override
    public boolean isLegalMove(Position b) {
        return (pos.x == b.x) && (b.y - pos.y == 1);
    }
}
