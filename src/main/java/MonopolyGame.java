import java.util.ArrayList;
import java.util.Random;


public class MonopolyGame {

    public enum PieceNames {
        Car
    }

    final static int NB_ROUNDS = 20;
    final static double INITIAL_CASH = 1500;
    int roundCount;
    ArrayList<Player> players;
    Board board;
    Die[] dice;


    public MonopolyGame(int nbPlayer) throws Exception {
        if(nbPlayer >= 2 && nbPlayer <= 8){
            board = new Board();
            dice = new Die[]{new Die(), new Die()};
            players = new ArrayList<>(nbPlayer);
            for(int i = 0; i < nbPlayer; ++i){
                String name = "player" + i;
                players.add(new Player(name, dice, board, PieceNames.Car));
            }
        }
        else throw new IllegalArgumentException("Wrong nbPlayer input (between 2 and 8)");
    }

    public boolean playGame(){
        for(int i = 0; i < NB_ROUNDS; ++i){
            System.out.println("--- ROUND " + (i+1) + " ---");
            playRound();
        }
        return true;
    }

    private void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }
}
