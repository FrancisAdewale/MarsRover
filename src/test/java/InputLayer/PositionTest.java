package InputLayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {



    @Test
    void testPositionCordinates() {
        Position pos = new Position(2,4,Direction.N);


        assertAll(
                () -> assertEquals(2, pos.getX()),
                () -> assertEquals(4, pos.getY()),
                () -> assertFalse(pos.getX() == 5),
                () -> assertNotEquals(2, pos.getY())
        );

    }

    @Test
    void testPositionDirection() {
        Position pos = new Position(2,4,Direction.N);
        assertEquals("N", pos.getFacing().name());

        pos.setFacing(Direction.S);
        assertEquals("S", pos.getFacing().name());
        assertNotEquals("N",pos.getFacing().name());




    }



}
