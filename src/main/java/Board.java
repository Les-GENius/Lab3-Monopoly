import java.util.ArrayList;

public class Board {

    public static final Square FIRST = new GoSquare("Go");
    public static final Square JAIL = new GoToJailSquare("Jail");
    public static final Square TAX = new IncomeTaxSquare("Tax");

    private ArrayList<Square> squares;
    private static int nbSquares = 40;

    Board(){
        squares = new ArrayList<>(nbSquares);
        
        for(int i = 0; i < nbSquares; ++i){
            if(i == 0){
                squares.add(0, FIRST);
            }
            else if(i == 4 ){
                squares.add(i, TAX);
            }
            else if(i == 30){
                squares.add(i, JAIL);
            }else{
                squares.add(i, new RegularSquare("Square " + i));
            }
        }
    }


    public Square getSquare(Square oldLocation, int faceValueTotal){
        return squares.get((squares.indexOf(oldLocation) + faceValueTotal) % nbSquares);
    }
}
