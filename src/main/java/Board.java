import java.util.ArrayList;

public class Board {

    public static final Square FIRST = new Square("Go");

    private ArrayList<Square> squares;
    private static int nbSquares = 40;

    Board(){
        squares = new ArrayList<>(nbSquares);
        squares.add(0, FIRST);

        for(int i = 1; i < nbSquares; ++i){
            squares.add(i, new Square("Square " + i));
        }
    }


    public Square getSquare(Square oldLocation, int faceValueTotal){
        return squares.get(squares.indexOf(oldLocation) + faceValueTotal);
    }
}
