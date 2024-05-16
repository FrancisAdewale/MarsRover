package LogicLayer;

import InputLayer.Instruction;
import InputLayer.Position;

import java.util.List;

public class Rover {

    private Position startingPosition;
    private List<Instruction> instructionList;
    private Position finalPosition;

    public Rover(Position startingPosition, List<Instruction> instructionList) {
        this.startingPosition = startingPosition;
        this.instructionList = instructionList;
    }

    public Position getFinalPosition() {
        return finalPosition;
    }

    public void setFinalPosition(Position finalPosition) {
        this.finalPosition = finalPosition;
    }
}
