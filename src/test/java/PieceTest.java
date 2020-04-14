import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class PieceTest {

    @Test
    void pieceCanMoveTest() {
        Square src = new Square();
        Square dest = new Square();
        Piece p = new Piece("Car");

        p.setLocation(src);
        assertSame(p.getLocation(), src);

        p.setLocation(dest);
        assertSame(p.getLocation(), dest);
    }
}
