package LogicLayer;

import InputLayer.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void roverRotatesRight() {

        Plateau plateau = InputParser.parsePlateauSize("5 5");

        Direction facing = Direction.N;
        Position startingPos = new Position(2,4, facing);
        List<Instruction> instructions = List.of(Instruction.R);

        Rover rover = new Rover(startingPos,instructions,plateau);
        rover.traverse();
        assertEquals(Direction.E, startingPos.getFacing());

    }

    @Test
    void roverRotatesLeft() {
        Plateau plateau = InputParser.parsePlateauSize("5 5");

        Direction facing = Direction.N;
        Position startingPos = new Position(2,4, facing);
        List<Instruction> instructions = List.of(Instruction.L);

        Rover rover = new Rover(startingPos,instructions,plateau);
        rover.traverse();
        assertEquals(Direction.W, startingPos.getFacing());

    }

    @Test
    void roverMovesForwardOnce() {
        Plateau plateau = InputParser.parsePlateauSize("5 5");

        Direction facing = Direction.N;
        Position startingPos = new Position(2,2, facing);
        List<Instruction> instructions = List.of(Instruction.M);

        Rover rover = new Rover(startingPos,instructions,plateau);
        rover.traverse();

        assertEquals(3, startingPos.getY());


    }
}