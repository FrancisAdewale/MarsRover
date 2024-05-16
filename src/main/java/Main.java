import InputLayer.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width and height: ");
        String grid = scanner.nextLine();
        var plateau = InputParser.parsePlateauSize(grid);

        System.out.println("Where do you want to land: ");
        String landingPosition = scanner.nextLine();
        var position = InputParser.parsePosition(landingPosition);

        plateau.getPlateauSize()[position.getX() - 1][position.getY()- 1] = "R:" + position.getFacing();
        plateau.printPlateau();

        System.out.println("What are your instructions: ");
        String instructions = scanner.nextLine();
        var instructionList = InputParser.parseInstruction(instructions);






    }
}
