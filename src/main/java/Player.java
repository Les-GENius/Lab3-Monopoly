import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Die> dies;
    private Piece piece;

    public Player(String name, ArrayList<Die> dies, Piece piece) {
        this.name = name;
        this.dies = dies;
        this.piece = piece;
    }

    public void takeTurn() {
        System.out.println(name + "'s turn");

        int scoreDie = 0;
        for(Die d: dies){
            scoreDie += d.getFaceValue();
        }
    }
}
