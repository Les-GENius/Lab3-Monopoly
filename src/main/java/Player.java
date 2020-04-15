public class Player {

    private String name;
    private Cup cup;
    private Board board;
    private Square location;
    private double cash;

  
    public Player(String name, Cup cup, Board board){
        this.name = name;
        this.cup = cup;
        this.board = board;
        this.location = Board.FIRST;
        this.cash = MonopolyGame.INITIAL_CASH;
    }

    public void takeTurn(){
        System.out.println(name + "'s turn");

        int faceValueTotal = 0;

        cup.roll();
        faceValueTotal = cup.getTotal();
        System.out.println("    - Dies value: " + faceValueTotal);

        // update the player location
        this.location = board.getSquare(this.location, faceValueTotal);
    }

    public void addCash(double cash){
        this.cash += cash;
    }

    public void reduceCash(double cash){
        this.cash -= cash;
    }

    public double getNetWorth(){
        return this.cash;
    }

    public void setLocation(Square location){
        this.location = location;
    }

    public Square getLocation() {
        return this.location;
    }
}
