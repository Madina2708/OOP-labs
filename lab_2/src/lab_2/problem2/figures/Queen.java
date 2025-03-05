package lab_2.problem2.figures;

import lab_2.problem2.Piece;
import lab_2.problem2.Position;


public class Queen extends Piece {
    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(pos.x - b.x);
        int dy = Math.abs(pos.y - b.y);

        boolean isDiagonal = (dx == dy);
        boolean isStraight = (pos.x == b.x || pos.y == b.y);

        return (isDiagonal || isStraight) && (dx != 0 || dy != 0);
    }
}
