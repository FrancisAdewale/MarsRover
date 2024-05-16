package LogicLayer;

import InputLayer.Direction;
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
            if(startingPosition.getFacing().name().equalsIgnoreCase("n")) {
                if(i.name().equalsIgnoreCase("l")){
                    startingPosition.setFacing(Direction.W);
                } else if(i.name().equalsIgnoreCase("r")) {
                    startingPosition.setFacing(Direction.E);
                } else {
                    plateau.getPlateauSize()[startingPosition.getX()][startingPosition.getY() + 1] = "/";
                }
            } else if(startingPosition.getFacing().name().equalsIgnoreCase("e")) {
                if(i.name().equalsIgnoreCase("l")){
                    startingPosition.setFacing(Direction.N);
                } else if(i.name().equalsIgnoreCase("r")) {
                    startingPosition.setFacing(Direction.S);
                } else {
                    plateau.getPlateauSize()[startingPosition.getX() + 1][startingPosition.getY()] = "/";
                }
            } else if(startingPosition.getFacing().name().equalsIgnoreCase("s")) {
                if(i.name().equalsIgnoreCase("l")) {
                    startingPosition.setFacing(Direction.E);
                } else if (i.name().equalsIgnoreCase("r")) {
                    startingPosition.setFacing(Direction.W);
                } else {
                    plateau.getPlateauSize()[startingPosition.getX()][startingPosition.getY() + 1] = "/";
                }
            } else {
                if(i.name().equalsIgnoreCase("l")) {
                    startingPosition.setFacing(Direction.S);
                }
            }

        }


    }
}
