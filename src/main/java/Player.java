public class Player {

    private String name;
    private Die[] dies;
    private Board board;
    private Piece piece;

    public Player(String name, Die[] dies, Board board, MonopolyGame.PieceNames piece){
        this.name = name;
        this.dies = dies;
        this.piece = new Piece(piece.name(), Board.FIRST);
    }

    public void takeTurn(){
        System.out.println(name + "'s turn");

        int scoreDie = 0;
        for(Die d: dies){
            d.roll();
            scoreDie += d.getFaceValue();
        }
    }

    public void addCash(int cash){

    }
}
