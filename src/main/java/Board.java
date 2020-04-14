public class Board {

    Square[] squares;
    private static int nbSquares = 40;

    Board(){
        squares = new Square[nbSquares];
    }

    public Square getSquare(Square oldLoc, int faceValueTotal){
        return squares[oldLoc.getId() + faceValueTotal];
    }
}
