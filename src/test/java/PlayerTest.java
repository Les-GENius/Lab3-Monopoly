import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {

    Cup cup;
    Board board;

    @BeforeEach
    void setUp() {
        this.cup = new Cup(2);
        this.board = new Board();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Henry", "Paul", "Colette", "Rémi"})
    void playerTest(String name){
        Player player = new Player(name, this.cup, this.board);

        player.takeTurn();
        assertNotNull(player);
    }

    @Test
    void playerHasInitialCash() {
        Player player = new Player("Bob", this.cup, this.board);

        assertEquals(MonopolyGame.INITIAL_CASH, player.getNetWorth());
    }

    @Test
    void playerCanGainCash() {
        Player player = new Player("Bob", this.cup, this.board);
        player.addCash(500);

        assertEquals(MonopolyGame.INITIAL_CASH+500, player.getNetWorth());
    }

    @Test
    void playerCanLooseCash() {
        Player player = new Player("Bob", this.cup, this.board);
        player.reduceCash(500);

        assertEquals(MonopolyGame.INITIAL_CASH-500, player.getNetWorth());
    }

    @Test
    void playerCanChangeLocation() {
        Player player = new Player("Bob", this.cup, this.board);
        Square newLoc = new RegularSquare("Square Test");
        player.setLocation(newLoc);

        assertSame(newLoc, player.getLocation());
    }
}
