
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SquareTest {

    @Test
    public void testSquare(){
        Square square = new Square("Go");
        assertEquals(square.getName(), "Go");
    }
}
