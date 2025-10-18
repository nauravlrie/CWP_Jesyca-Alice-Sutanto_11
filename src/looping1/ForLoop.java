package looping1;

public class ForLoop {
public int getNumbersAndSum(int maximalNumber) {
    int sum = 0;
    for (int i = 1; i <= maximalNumber; i++) {
        sum += i;
    }
    return sum;
    }
}
