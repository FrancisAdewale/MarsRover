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
    private Direction facing;


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

        plateau.printCurrentPlateauGrid();

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
                switch (startingPosition.getFacing()) {
                    case N:
                        newY += 1;
                        startingPosition.setY(newY);
                        plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
                        break;
                    case E:
                        newX +=1;
                        startingPosition.setX(newX);
                        plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
                        break;
                    case S:
                        newY -= 1;
                        startingPosition.setY(newY);
                        plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
                        break;
                    case W:
                        newX -=1;
                        startingPosition.setX(newX);
                        plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
                        break;
                }


//            if(startingPosition.getFacing().name().equalsIgnoreCase("n")) {
//
//                if(i.name().equalsIgnoreCase("L")){
//                    startingPosition.setFacing(Direction.W);
//                } else if(i.name().equalsIgnoreCase("R")) {
//                    startingPosition.setFacing(Direction.E);
//                } else {
//                    int newX = startingPosition.getX() + 1;
//                    if (newX < plateau.getPlateauSize().length) {
//                        startingPosition.setX(newX);
//                    }
//                    startingPosition.setX(newX);
//                    plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
//                }
//
//            }  else if(startingPosition.getFacing().name().equalsIgnoreCase("e")) {
//                if(i.name().equalsIgnoreCase("L")){
//                    startingPosition.setFacing(Direction.N);
//                } else if(i.name().equalsIgnoreCase("R")) {
//                    startingPosition.setFacing(Direction.S);
//                } else {
//                    int newY = startingPosition.getY() + 1;
//                    if (newY < plateau.getPlateauSize().length) {
//                        startingPosition.setY(newY);
//                    }
//
//                    plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
//                }
//
//            } else if(startingPosition.getFacing().name().equalsIgnoreCase("s")) {
//                if(i.name().equalsIgnoreCase("L")) {
//                    startingPosition.setFacing(Direction.E);
//                } else if (i.name().equalsIgnoreCase("R")) {
//                    startingPosition.setFacing(Direction.W);
//                } else {
//                    int newX = startingPosition.getX();
//                    int newY = startingPosition.getY();
//                    switch (startingPosition.getFacing()) {
//                        case N:
//                            newY++;
//                            break;
//                        case E:
//                            newX++;
//                            break;
//                        case S:
//                            newY--;
//                            break;
//                        case W:
//                            newX--;
//                            break;
//                    }
//                    plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
//                }
//
//            } else {
//                if(i.name().equalsIgnoreCase("L")) {
//                    startingPosition.setFacing(Direction.S);
//                } else if (i.name().equalsIgnoreCase("R")) {
//                    startingPosition.setFacing(Direction.N);
//                } else {
//                    int newY = startingPosition.getY() + 1;
//                    if (newY < plateau.getPlateauSize().length) { // Check if within bounds
//                        startingPosition.setY(newY);
//                    }
//                    plateau.getPlateauSize()[startingPosition.getY()][startingPosition.getX()] = "/";
//                }
//
                plateau.printCurrentPlateauGrid();
//                System.out.println();
//
                finalPosition = startingPosition;
                System.out.println("Final Position: " + finalPosition.toString());
//            }

            }



        }
    }


}
