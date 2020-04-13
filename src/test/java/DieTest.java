import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DieTest {



    @Test
    void rollTest(){
        Die die = new Die();

        for(int i = 0; i < 50; ++i){
            die.roll();
            int value = die.getFaceValue();
            assertTrue(value >= 1 && value <= 6 );
        }
    }

}

