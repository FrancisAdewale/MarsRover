package InputLayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {

    @Test
    void testPositionCordinates() {
        Position pos = new Position(2,4,Direction.N);

        assertAll(
                () -> assertEquals(2, pos.getX()),
                () -> assertEquals(4, pos.getY())
        );




    }
}
