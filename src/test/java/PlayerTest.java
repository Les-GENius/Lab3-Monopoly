import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;


public class PlayerTest {


    @ParameterizedTest
    @ValueSource(strings = {"Henry", "Paul", "Colette", "Rémi"})
    void playerTest(String name){
        Die[] dies = new Die[]{new Die(), new Die()}; 

        Player player = new Player(name, dies, new Board(), MonopolyGame.PieceNames.Car);
        player.takeTurn();
        assertNotNull(player);
    }

}
