
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonopolyTest {
    @Test
    public void testDie(){
        Die die = new Die();
        for(int i = 0; i < 100; ++i){
            die.roll();
            assertTrue((1 <= die.getFaceValue()) && (6 >= die.getFaceValue()));
        }
    }
}
