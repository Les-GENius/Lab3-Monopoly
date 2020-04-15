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
        Square go = new GoSquare("Go");
        assertEquals(go.toString(), "Go");
    }
}
