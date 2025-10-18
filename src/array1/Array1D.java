package array1;

public class Array1D {
    public String getArrayInfo(int[] numbers) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        for (int number : numbers) { 
            result.append(number).append(" "); 
            sum += number; 
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        result.append("\nSum: ").append(sum); 
        return result.toString(); 
    }
}