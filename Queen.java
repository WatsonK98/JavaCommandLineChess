public class Queen extends Piece {

    final public static int[][] moveSetQueen = {
        //Vertical up
        {0,1},
        //Horizontal Right
        {1,0},
        //Vertical Down
        {0,-1},
        //Horizontal Left
        {-1,0},
        //Diagonal up left
        {-1,1},
        //Diagonal up right
        {1,1},
        //Diagonal down right
        {1,-1},
        //Diagonal down left
        {-1,-1}
    };
    
    public Queen(int player) {
        super("Queen", player, moveSetQueen, 0, false, true);
    }
}
