import InputLayer.*;
import LogicLayer.Rover;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter width and height: ");
                String grid = scanner.nextLine();
                var plateau = InputParser.parsePlateauSize(grid);
                //plateau.addValuesToPlateau();

                System.out.println("Where do you want to land: ");
                String landingPosition = scanner.nextLine();
                var position = InputParser.parsePosition(landingPosition);

                //plateau.getPlateauSize()[position.getY() - 1][position.getX()-1] = "R:" + position.getFacing();
                System.out.println("What are your instructions: ");
                String instructions = scanner.nextLine();
                var instructionList = InputParser.parseInstruction(instructions);

                Rover rover = new Rover(position,instructionList,plateau);
                rover.traverse();

                System.out.println("Retsart? (yes/no): ");
                String continueChoice = scanner.nextLine();
                if (continueChoice.equalsIgnoreCase("no")) {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please add a space between inputs i.e 5 5");
            } catch (NumberFormatException e) {
                System.out.println("Please enter digits for Width and Height");
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a valid compass direction e.g. N, E, S, W");
            }
        }

    }
}
