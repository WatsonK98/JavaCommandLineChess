public class Knight extends Piece {

    final public static int[][] moveSetKnight = {
        //Up 2 left 1
        {-1,2},
        //Up 2 right 1
        {1,2},
        //Right 2 up 1
        {2,1},
        //Right 2 down 1
        {2,-1},
        //Down 2 right 1
        {1,-2},
        //Down 2 left 1
        {-1,-2},
        //Left 2 down 1
        {-2,-1},
        //Left 2 up 1
        {-2,1}
    };
    
    public Knight(int player) {
        super("Knight", player, moveSetKnight, 0, false, false);
    }
}
