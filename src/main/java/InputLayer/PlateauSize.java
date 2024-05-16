package InputLayer;

import java.util.Arrays;

public class PlateauSize {

    private String[][] plateauSize;

    public PlateauSize() {

    }

    public String[][] getPlateauSize() {
        return plateauSize;
    }

    public void setPlateauSize(String[][] plateauSize) {
        this.plateauSize = plateauSize;
    }

    public void addValuesToPlateau() {
        for (int r = 0; r< this.plateauSize.length;r++){
            for (int c = 0; c <this.plateauSize.length;c++){
                this.plateauSize[r][c] = "?";  // Initialize the cell
                System.out.print("[" +this.plateauSize[r][c] + "]"); // Display the content of cell board
            }
            System.out.println();  // go to next line
        }
    }

    public void printCurrentPlateauGrid() {
        for (int r = 0; r< this.plateauSize.length;r++){
            for (int c = 0; c <this.plateauSize.length;c++){
                System.out.print("[" +this.plateauSize[r][c] + "]"); // Display the content of cell board
            }
            System.out.println();  // go to next line
        }
        System.out.println();

    }
}
