package looping1;

public class DoWhileLoop {
    public int getOddNumbersAndSum(int maximalNumber) {
        int sum = 0; 
        int i = 1; 
        if (maximalNumber < 1) {
            return 0;
        }
            do {
            if (i % 2 != 0) { 
                sum += i; 
            }
            i++; 
        } while (i <= maximalNumber); 
            
          return sum;
    }
}






