import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonopolyGameTest {
    @Test
    public void testMonopolyGame(){
        MonopolyGame monpoly = new MonopolyGame();
        assertTrue(monpoly.playGame());
    }
}
