public class Rook extends Piece {

    public static final int[][] moveSetRook = {
        //Vertical up
        {0,1},
        //Horizontal Right
        {1,0},
        //Vertical Down
        {0,-1},
        //Horizontal Left
        {-1,0}
    };
    
    public Rook(int player) {
        super(player, moveSetRook, 0, false, true);
    }
}
