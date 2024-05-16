import InputLayer.Direction;
import InputLayer.PlateauSize;
import InputLayer.Position;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Enter width and height: ");
        Scanner scanner = new Scanner(System.in);
        String grid = scanner.nextLine();


        System.out.println("Where do you want to land: ");
        String landingPosition = scanner.nextLine();
        String[] splitLandingPosition = landingPosition.split(" ");

        String x = splitLandingPosition[0];
        String y = splitLandingPosition[1];
        String facing = splitLandingPosition[2];
        Position position;
        if(facing.equalsIgnoreCase(Direction.N.name())) {
            position = new Position(Integer.valueOf(x),Integer.valueOf(y), Direction.N);
        } else if(facing.equalsIgnoreCase(Direction.W.name())) {
             position = new Position(Integer.valueOf(x),Integer.valueOf(y), Direction.W);
        } else if(facing.equalsIgnoreCase(Direction.E.name())) {
            position = new Position(Integer.valueOf(x),Integer.valueOf(y), Direction.W);
        } else {
            position = new Position(Integer.valueOf(x),Integer.valueOf(y), Direction.S);
        }

        String[] splitGrid = grid.split(" ");
        String width = splitGrid[0];
        String height = splitGrid[1];
        PlateauSize plateau = new PlateauSize();

        plateau.setPlateauSize(new String[Integer.valueOf(width)][Integer.valueOf(height)]);
        System.out.println("Position data: " + position);
        plateau.getPlateauSize()[position.getX() - 1][position.getY()- 1] = "R:" + position.getFacing();
        plateau.printPlateau();






    }
}
