import InputLayer.PlateauSize;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter upper-right coordinates: ");
        Scanner scanner = new Scanner(System.in);
        String coordinates = scanner.nextLine();
        String[] splitCoOrdinates = coordinates.split(" ");
        String width = splitCoOrdinates[0];
        String height = splitCoOrdinates[1];
        PlateauSize plateau = new PlateauSize();
        plateau.setPlateauSize(new String[Integer.valueOf(width)][Integer.valueOf(height)]);

        plateau.printPlateau();






    }
}
