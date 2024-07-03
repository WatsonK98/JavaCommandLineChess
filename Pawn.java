public class Pawn extends Piece {

    public static final int[][] moveSetPawn = {
        //Default
        {0,1}
    };
    
    public Pawn(int player, int[] position) {
        super("Pn", player, moveSetPawn, 0, position,false);
    }

    @Override
    public boolean hasMagnitude() {
        return getMoves() == 0;
    }
}