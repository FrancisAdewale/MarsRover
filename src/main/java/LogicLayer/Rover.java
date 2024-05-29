package LogicLayer;

import InputLayer.Instruction;
import InputLayer.Plateau;
import InputLayer.Position;

import java.util.List;

public class Rover {

    private Position startingPosition;
    private List<Instruction> instructionList;
    private Position finalPosition;
    private Plateau plateau;


    public Rover(Position startingPosition, List<Instruction> instructionList, Plateau plateau) {
        this.startingPosition = startingPosition;
        this.instructionList = instructionList;
        this.plateau = plateau;
    }

//    public Position getFinalPosition() {
//        return finalPosition;
//    }
//
//
//    public void setFinalPosition(Position finalPosition) {
//        this.finalPosition = finalPosition;
//    }

    public void traverse() {
        //System.out.println("Starting Position: " + this.startingPosition.toString());

        //plateau.printCurrentPlateauGrid();

        for (Instruction i : instructionList) {

            if (i == Instruction.L) {
                startingPosition.rotateLeft();
            } else if (i == Instruction.R) {
                startingPosition.rotateRight();
            } else {
                int newX = startingPosition.getX();
                int newY = startingPosition.getY();
                int maxX = plateau.getPlateauSize()[0].length; //X AXIS LENGTH
                int maxY = plateau.getPlateauSize().length; //Y AXIS LENGTH
                switch (startingPosition.getFacing()) {
                    case N:
                        newY = (newY + 1) % maxY;
                        break;
                    case E:
                        newX = (newX + 1) % maxX;

                        break;
                    case S:
                        newY = (newY - 1 + maxY) % maxY;
                        break;
                    case W:
                        newX = (newX - 1 + maxX) % maxX;
                        break;
                }

                startingPosition.setX(newX);
                startingPosition.setY(newY);
                //plateau.getPlateauSize()[newY][newX] = "/";
                //plateau.printCurrentPlateauGrid();
            }

        }
        finalPosition = startingPosition;
        System.out.println(finalPosition.getX() + " " + finalPosition.getY() + " " + finalPosition.getFacing());
    }


}
