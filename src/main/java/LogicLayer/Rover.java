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
                // Rotate left
                startingPosition.rotateLeft();
            } else if (i == Instruction.R) {
                // Rotate right
                startingPosition.rotateRight();
            } else {
                // Move forward
                int newX = startingPosition.getX();
                int newY = startingPosition.getY();
                int maxX = plateau.getPlateauSize()[0].length;
                int maxY = plateau.getPlateauSize().length;
                switch (startingPosition.getFacing()) {
                    case N:
                        newY = (newY + 1) % maxY; //3 mod 5 = 3 4 mod 5 = 4 5 mod 5 = 0 which loops it over
                       // startingPosition.setY(newY);
                       // plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
                        break;
                    case E:
                        newX = (newX + 1) % maxX;
                       // startingPosition.setX(newX);
                        //plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
                        break;
                    case S:
                        newY = (newY - 1 + maxY) % maxY;
                       // startingPosition.setY(newY);
                        //plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
                        break;
                    case W:
                        newX = (newX - 1 + maxX) % maxX;
                        //startingPosition.setX(newX);
                        //plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
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
