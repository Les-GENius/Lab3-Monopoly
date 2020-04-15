import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SquareTest {

    @Test
    public void testRegularSquare(){
        Square square = new RegularSquare("Square1");
        assertEquals(square.toString(), "Square1");
    }
    @Test
    public void testGoSquare(){
        Square go = Board.FIRST;
        assertEquals(go.toString(), "Go");
    }
    @Test
    public void testGoJailSquare(){
        Square jail = Board.JAIL;
        assertEquals(jail.toString(), "Jail");
    }
    @Test
    public void testIncomeTaxSquare(){
        Square go = new IncomeTaxSquare("Tax");
        assertEquals(go.toString(), "Tax");
    }
}
