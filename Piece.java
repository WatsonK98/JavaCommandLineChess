public class Piece {

    int owner;
    int[][] moveSet;
    int moves;
    boolean isKing;
    boolean hasMagnitude;

    public Piece(int owner, int[][] moveSet, int moves, boolean isKing, boolean hasMagnitude) {
        this.owner = owner;
        this.moveSet = moveSet;
        this.moves = moves;
        this.isKing = isKing;
        this.hasMagnitude = hasMagnitude;
    }

    public Piece(int owner, int[][] moveSet, int moves, boolean isKing) {
        this.owner = owner;
        this.moveSet = moveSet;
        this.moves = moves;
        this.isKing = isKing;
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
