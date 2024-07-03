public class Bishop extends Piece {

    final public static int[][] moveSetBishop = {
        //Diagonal up left
        {-1,1},
        //Diagonal up right
        {1,1},
        //Diagonal down right
        {1,-1},
        //Diagonal down left
        {-1,-1}
    };

        public Bishop(int player, int[] position) {
            super("Bishop", player, moveSetBishop, 0, position, false, true);
        }

}
