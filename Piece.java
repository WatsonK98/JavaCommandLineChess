public class Piece {

    String name;
    int owner;
    int[][] moveSet;
    int moves;
    int[] position;
    boolean isKing;
    boolean hasMagnitude;

    //Default constructor
    public Piece(String name, int owner, int[][] moveSet, int moves, int[] position, boolean isKing, boolean hasMagnitude) {
        this.name = name;
        this.owner = owner;
        this.moveSet = moveSet;
        this.moves = moves;
        this.position = position;
        this.isKing = isKing;
        this.hasMagnitude = hasMagnitude;
    }

    //Overloaded constructor because of special pawn rule
    public Piece(String name, int owner, int[][] moveSet, int moves, int[] position, boolean isKing) {
        this.name = name;
        this.owner = owner;
        this.moveSet = moveSet;
        this.moves = moves;
        this.position = position;
        this.isKing = isKing;
    }

    public String getName() {
        return this.name;
    }

    public int getOwner() {
        return this.owner;
    }

    public int[][] getMoveSet() {
        return this.moveSet;
    }
    
    public int getMoves() {
        return this.moves;
    }

    public void setMoves(int increment) {
        this.moves += increment;
    }

    public boolean isKing() {
        return this.isKing;
    }

    public boolean hasMagnitude() {
        return this.hasMagnitude;
    }
}
