import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {


    @Test
    public void getSquareTest(){


        assertAll("Squares",
                () -> {
                    Board board = new Board();
                    assertEquals(board.getSquare(Board.FIRST, 0), Board.FIRST);
                    assertEquals(board.getSquare(Board.FIRST, 10).getName(), "Square 10");
                });
    }
}
