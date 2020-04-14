import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonopolyGameTest {
    @Test
    public void testMonopolyGame() throws Exception {
        MonopolyGame monpoly = new MonopolyGame(5);
        assertTrue(monpoly.playGame());
    }

    @Test
    public void testMonopolyGameWrongInput(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            new MonopolyGame(9);
        });

        String expectedMessage = "Wrong nbPlayer input (between 2 and 8)";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
