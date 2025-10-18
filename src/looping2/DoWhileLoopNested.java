package looping2;

public class DoWhileLoopNested {
    public String getNumberTriangle(int maximalNumber) {
        StringBuilder triangle = new StringBuilder();
        int row = 1;
        do {
            int col = 1; 
            do {
                triangle.append(col); 
                col++; 
            } while (col <= row); 
            if (row < maximalNumber) { 
                triangle.append("\n"); 
            } 
            row++; 
        } while (row <= maximalNumber); 
        return triangle.toString();
    }
}
