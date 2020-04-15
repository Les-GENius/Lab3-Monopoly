import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupTest {

    @RepeatedTest(50)
    void rollTest(){

        final int minValue = 1;
        final int maxValue = 6;

        int nbDies = 2;
        Cup cup = new Cup(nbDies);
        cup.roll();
        int value = cup.getTotal();
        assertTrue(value >= minValue*nbDies && value <= maxValue*nbDies);
    }


}
