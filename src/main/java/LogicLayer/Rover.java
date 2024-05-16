package LogicLayer;

import InputLayer.Instruction;
import InputLayer.PlateauSize;
import InputLayer.Position;

import java.util.List;

public class Rover {

    private Position startingPosition;
    private List<Instruction> instructionList;
    private Position finalPosition;
    private PlateauSize plateau;

    public Rover(Position startingPosition, List<Instruction> instructionList, PlateauSize plateau) {
        this.startingPosition = startingPosition;
        this.instructionList = instructionList;
        this.plateau = plateau;
    }

    public Position getFinalPosition() {
        return finalPosition;
    }

    public void setFinalPosition(Position finalPosition) {
        this.finalPosition = finalPosition;
    }

    public void traverse() {
        System.out.println("Starting Position: " + this.startingPosition.toString());

        for(Instruction i : instructionList) {

        }


    }
}
