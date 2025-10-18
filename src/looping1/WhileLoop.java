package looping1;

public class WhileLoop {
    public int getEventNumbersAndSum(int maximalNumber) {
        int sum = 0;
        int i = 1;
        while (i <= maximalNumber) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
    
}
