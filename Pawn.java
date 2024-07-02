public class Pawn extends Piece {

    public static final int[][] moveSetPawn = {
        //Default
        {0,1}
    };
    
    public Pawn(int player) {
        super("Pawn", player, moveSetPawn, 0, false);
    }

    @Override
    public boolean hasMagnitude() {
        return getMoves() == 0;
    }
}