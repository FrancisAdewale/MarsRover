package InputLayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateauTest {

    @Test
    void setPlaeauSize() {

        Plateau plateauSize = new Plateau();
        //Arrange
        plateauSize.setPlateauSize(new String[5][5]);
        //Act
        //Assert
        assertAll(
                () -> assertArrayEquals(new String[5][5], plateauSize.getPlateauSize()),
                () -> assertTrue(!plateauSize.getPlateauSize().equals(new String[4][7]))
        );
    }



}