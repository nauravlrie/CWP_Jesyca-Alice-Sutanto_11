package looping1;

public class ForLoop {
public int getNumbersAndSum(int maximalNumber) {
    int sum = 0;
    // for loop digunakan untuk menjalankan bil dari 1 sampai maximalNumber
    for (int i = 1; i <= maximalNumber; i++) {
        sum += i; // menambhakan i ke sum
    }
    return sum;
    // return hasil sum
    }
}
