package looping1;

public class DoWhileLoop {
    public int getOddNumbersAndSum(int maximalNumber) {
        int sum = 0; // inisilaisasi variabel sum dengan 0
        int i = 1; // inisialisasi variabel i dengan 1
        if (maximalNumber < 1) {
            return 0;
        }
        // do while loop untuk menjumlahkan bilangan ganjil
            do {
            if (i % 2 != 0) { // mengecek apakah i adalah bil ganjil
                sum += i; // menambahkan i ke sum jika i bil ganjil
            }
            i++; // increment i
        } while (i <= maximalNumber); // kondisi loop akan terus berlanjut jika i kurang dari atau sama dengan maximalNumber
            
          return sum;
        // return hasil sum
    }
}






