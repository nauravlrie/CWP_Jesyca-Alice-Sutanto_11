package looping2;

public class ForLoopNested {
    public String getGrid(int maxNumber) {
        StringBuilder grid = new StringBuilder(); 
        
            for (int row = 1; row <= maxNumber; row++) {
            for (int col = 1; col <= maxNumber; col++) {
                grid.append("Row ").append(row).append(" Col ").append(col); 
                if (col < maxNumber) {
                    grid.append("\n");

                }
            }
                if (row < maxNumber) {
                grid.append("\n");
            }
        }
        return grid.toString();
    }
}