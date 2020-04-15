import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {

    Die[] dies;
    Board board;

    @BeforeEach
    void setUp() {
        this.dies = new Die[]{new Die(), new Die()};
        this.board = new Board();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Henry", "Paul", "Colette", "Rémi"})
    void playerTest(String name){
        Player player = new Player(name, this.dies, this.board, MonopolyGame.PieceNames.Car);
        player.takeTurn();
        assertNotNull(player);
    }

    @Test
    void playerHasInitialCash() {
        Player player = new Player("Bob", this.dies, this.board, MonopolyGame.PieceNames.Car);

        assertEquals(MonopolyGame.INITIAL_CASH, player.getNetWorth());
    }

    @Test
    void playerCanGainCash() {
        Player player = new Player("Bob", this.dies, this.board, MonopolyGame.PieceNames.Car);
        player.addCash(500);

        assertEquals(MonopolyGame.INITIAL_CASH+500, player.getNetWorth());
    }

    @Test
    void playerCanLooseCash() {
        Player player = new Player("Bob", this.dies, this.board, MonopolyGame.PieceNames.Car);
        player.reduceCash(500);

        assertEquals(MonopolyGame.INITIAL_CASH-500, player.getNetWorth());
    }
}
