package function2;

public class Factorial {
    // Menambahkan function untuk menghitung faktorial
    public int factorial(int n) {
        if (n == 0) {
            return 1; // Basis: 0! sama dengan 1
        } else {
            //Untuk menghitung n! sama dengan n dikali faktorial(n-1)
            return n * factorial(n - 1);
        }
    }
}
