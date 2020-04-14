import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MonopolyGame {

    public enum PieceNames {
        Car
    }

    final static int NB_ROUNDS = 20;
    int roundCount;
    ArrayList<Player> players;
    Board board;
    Die[] dice;

    public MonopolyGame(){
        board = new Board();
        dice = new Die[]{new Die(), new Die()};
        // between 2 and 8 players
        int nbPlayer = new Random().nextInt(7) + 2;
        players = new ArrayList<>(nbPlayer);
        for(int i = 0; i < nbPlayer; ++i){
            String name = "player" + Integer.toString(i);
            players.add(new Player(name, dice, board, PieceNames.Car));
        }
    }

    public boolean playGame(){
        for(int i = 0; i < NB_ROUNDS; ++i){
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
