import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Die> dies;
    private Board board;
    private Piece piece;

    public Player(String name, ArrayList<Die> dies, Board board, Piece piece){
        this.name = name;
        this.dies = dies;
        this.board = board;
        this.piece = piece;
        System.out.println("New player " + name + " joins the game!");
    }

    public void takeTurn(){
        System.out.println(name + "'s turn:");
        int faceValueTotal = 0;
        for(Die d: dies){
            d.roll();
            faceValueTotal += d.getFaceValue();
        }
        System.out.println("    - Dies value: " + faceValueTotal);

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, faceValueTotal);

        piece.setLocation(newLoc);
    }

    public Piece getPiece() {
        return piece;
    }

}
