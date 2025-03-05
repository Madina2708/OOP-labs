package lab_2.problem2.figures;

import lab_2.problem2.Piece;
import lab_2.problem2.Position;

public class Bishop extends Piece {
    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(pos.x - b.x);
        int dy = Math.abs(pos.y - b.y);

        return (dx == dy) && (dx != 0); //if change in x = change in y
    }
}
