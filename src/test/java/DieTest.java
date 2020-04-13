import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DieTest {

    @Test
    void rollTest(){
        Die die = new Die();
        boolean valueTest = true;
        for(int i = 0; i < 50; ++i){
            die.roll();
            int value = die.getFaceValue();
            valueTest = (value >= 1 && value <= 6);
        }
        assertTrue(valueTest);
    }

}

