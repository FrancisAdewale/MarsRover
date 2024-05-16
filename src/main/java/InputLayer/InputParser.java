package InputLayer;

import java.util.ArrayList;
import java.util.List;

public class InputParser {



    public static Position parsePosition(String input) {

        String[] splitLandingPosition = input.split(" ");
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
        return position;
    }

    public static PlateauSize parsePlateauSize(String input) {
        String[] splitGrid = input.split(" ");
        String width = splitGrid[0];
        String height = splitGrid[1];
        PlateauSize plateau = new PlateauSize();
        plateau.setPlateauSize(new String[Integer.valueOf(width)][Integer.valueOf(height)]);
        return plateau;
    }

    public static List<Instruction> parseInstruction(String input) {
        String[] splitInstructions = input.split("");
        List<Instruction> instructionList = new ArrayList<>(List.of());
        for(String i : splitInstructions) {
            instructionList.add(Instruction.valueOf(i));
        }
        System.out.println(instructionList);
        return instructionList;
    }
    
    


}
