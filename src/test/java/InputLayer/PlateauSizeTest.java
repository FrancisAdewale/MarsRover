package InputLayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateauSizeTest {

    @Test
    void setPlaeauSize() {

        PlateauSize plateauSize = new PlateauSize();
        //Arrange

        plateauSize.setPlateauSize(new String[5][5]);
        //Act

        //Assert
        assertAll(
                () -> assertArrayEquals(new String[5][5], plateauSize.getPlateauSize())
        );
    }



}