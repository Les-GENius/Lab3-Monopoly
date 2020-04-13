import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {


    @ParameterizedTest
    @ValueSource(strings = {"Henry", "Paul", "Colette", "Rémi"})
    void playerTest(String name){
        ArrayList<Die> dies = new ArrayList<Die> (2);

        Player player = new Player(name, dies, new Board(), new Piece());
        assertNotNull(player);
    }

    @Test
    void takeTurnTest(){
        ArrayList<Die> dies = new ArrayList<Die> (2);
        Player player = new Player("Henry", dies);
        Square oldPosition = player.getPiece().getLocation();
        player.takeTurn();
        Square newPosition = player.getPiece().getLocation();

        assertNotEquals(oldPosition, newPosition);
    }

}
