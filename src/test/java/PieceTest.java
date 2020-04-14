import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class PieceTest {

    @Test
    void pieceCanMoveTest() {
        Square dest = new Square("Square 1");
        Piece p = new Piece("Car", Board.FIRST);

        p.setLocation(dest);
        assertSame(p.getLocation(), dest);
    }
}
