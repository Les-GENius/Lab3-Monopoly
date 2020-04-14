import java.util.ArrayList;

public class Board {


    private ArrayList<Square> squares;
    private static int nbSquares = 40;

    Board(){
        squares = new ArrayList<>(nbSquares);
        int i = 0;
        for(Square s: squares){
            s = new Square(Integer.toString(i));
            ++i;
        }
    }


    public Square getSquare(Square oldLocation, int faceValueTotal){
        return squares.get(squares.indexOf(oldLocation) + faceValueTotal);
    }
}
