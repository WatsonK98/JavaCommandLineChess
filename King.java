public class King extends Piece {

    final public static int[][] moveSetKing = {
        //Diagonal up left
        {-1,1},
        //Up 1
        {0,1},
        //Diagonal up right
        {1,1},
        //Right 1
        {1,0},
        //Diagonal down right
        {1,-1},
        //Down 1
        {-1,0},
        //Diagonal down left
        {-1,-1},
        //Left 1
        {-1,0}
    };
    
    public King(int player, int[] position) {
        super("King", player, moveSetKing, 0, position, true, false);
    }
}
