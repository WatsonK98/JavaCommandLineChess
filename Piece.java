public class Piece {

    String name;
    int owner;
    int[][] moveSet;
    int moves;
    boolean isKing;
    boolean hasMagnitude;

    public Piece(String name, int owner, int[][] moveSet, int moves, boolean isKing, boolean hasMagnitude) {
        this.name = name;
        this.owner = owner;
        this.moveSet = moveSet;
        this.moves = moves;
        this.isKing = isKing;
        this.hasMagnitude = hasMagnitude;
    }

    public Piece(String name, int owner, int[][] moveSet, int moves, boolean isKing) {
        this.name = name;
        this.owner = owner;
        this.moveSet = moveSet;
        this.moves = moves;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setMoveSet(int[][] moveSet) {
        this.moveSet = moveSet;
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
