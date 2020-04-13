import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Die> dies;
    private Board board;
    private Piece piece;

    public Player(String name, ArrayList<Die> dies, Board board, Piece piece){
        this.name = name;
        this.dies = dies;
    }

    public void takeTurn(){
        System.out.println(name + "'s turn");

        int scoreDie = 0;
        for(Die d: dies){
            scoreDie += d.getFaceValue();
        }


    }
}
