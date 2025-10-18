package looping2;

public class WhileLoopNested {
    public String getTriangle(int maximalNumber) {
        StringBuilder triangle = new StringBuilder();
        int row = 1;
        while (row <= maximalNumber) { 
            int col = 1;
            while (col <= row) { 
                triangle.append("*"); 
                col++;
            }
            
            if (row < maximalNumber) {
                triangle.append("\n");
            }
            row++; 
        }
        return triangle.toString();
    }
}