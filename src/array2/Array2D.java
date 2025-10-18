package array2;
public class Array2D {
    public String getMatrixInfo(int[][] matrix) {
        StringBuilder result = new StringBuilder();
        int totalSum = 0;
        int elementCount = 0; 

        for (int i = 0; i < matrix.length; i++) { 
            result.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < matrix[i].length; j++) { 
                int number = matrix[i][j]; 
                totalSum += number; 
                elementCount++; 
                result.append(number).append(number % 2 == 0 ? "E" : "O").append(" "); 
            }
            result.setLength(result.length() - 1);
            result.append(" \n");
        }
        result.append("Total: ").append(totalSum).append("\n");
        double average = (double) totalSum / elementCount;
        result.append("Average: ").append(String.format("%.1f", average));
        return result.toString();
    }
}
