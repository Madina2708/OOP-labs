package lab_2.problem2.figures;
import lab_2.problem2.Piece;
import lab_2.problem2.Position;

public class Rook extends Piece {
    @Override
    public boolean isLegalMove(Position b) {
        if (pos.x == b.x || pos.y == b.y) { //only by x or y
            return !(pos.x == b.x && pos.y == b.y); //If we in same point
        }
        return false;
    }
}