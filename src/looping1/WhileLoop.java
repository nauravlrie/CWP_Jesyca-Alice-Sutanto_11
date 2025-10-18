package looping1;

public class WhileLoop {
    public int getEvenNumbersAndSum(int maximalNumber) {
        int sum = 0;
        int i = 1;
        // while loop digunakan untuk menjalankan bil genap sampai maximalNumber
        while (i <= maximalNumber) { // kondisi loop akan terus berlanjut selama i masih kurang dari atau sama dengan maximalNumber
            if (i % 2 == 0) {  // mengecek apakah i adalah bil genap
                sum += i; // menambahkan i ke sum jika i bil genap
            }
            
            i++; // increment i
        }
        return sum;
        // return hasil sum
    }
}
