import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;


public class DieTest {

    @RepeatedTest(50)
    void rollTest(){
        Die die = new Die();
        die.roll();
        int value = die.getFaceValue();
        assertTrue(value >= 1 && value <= 6);
    }

}

