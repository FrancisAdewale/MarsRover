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


        for (int r = 0; r< plateau.getPlateauSize().length;r++){
            for (int c = 0; c <plateau.getPlateauSize().length;c++){
                plateau.getPlateauSize()[r][c] = "?";  // Initialize the cell
                System.out.print("[" +plateau.getPlateauSize()[r][c] + "]"); // Display the content of cell board
            }
            System.out.println();  // go to next line
        }






    }
}
