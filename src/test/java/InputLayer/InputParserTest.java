package InputLayer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void parsePosition() {
        Position expected = new Position(1,2,Direction.N);
        String input = "1 2 N";
        Position actual = InputParser.parsePosition(input);

        assertEquals(expected.toString(), actual.toString());
        assertNotEquals(expected.hashCode(), InputParser.parsePosition("2 4 S").hashCode());

    }

    @Test
    void parsePlateauSize() {

        PlateauSize expected = new PlateauSize();
        String input = "5 5";
        expected.setPlateauSize(new String[5][5]);
        PlateauSize actual =  InputParser.parsePlateauSize(input);
        assertEquals(expected.getPlateauSize().length, actual.getPlateauSize().length);

    }

    @Test
    void parseInstruction() {
        String input = "LMLMLMLMLMLMLM";
        List<Instruction> expected = new ArrayList<>(List.of(
                Instruction.L,Instruction.M,Instruction.L,Instruction.M,
                Instruction.L,Instruction.M,Instruction.L,Instruction.M,
                Instruction.L,Instruction.M,Instruction.L,Instruction.M,
                Instruction.L,Instruction.M
                ));

        List<Instruction> actual = InputParser.parseInstruction(input);
        assertEquals(expected, actual);





    }
}