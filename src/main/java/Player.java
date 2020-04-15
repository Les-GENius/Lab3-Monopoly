public class Player {

    private String name;
    private Die[] dies;
    private Board board;
    private Piece piece;

    public Player(String name, Die[] dies, Board board, MonopolyGame.PieceNames piece){
        this.name = name;
        this.dies = dies;
        this.board = board;
        this.piece = new Piece(piece.name(), Board.FIRST);
    }

    public void takeTurn(){
        System.out.println(name + "'s turn");

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

    public void addCash(int cash){

    }
}
