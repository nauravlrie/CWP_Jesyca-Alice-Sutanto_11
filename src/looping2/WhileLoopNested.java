package looping2;

public class WhileLoopNested {
    public String getTriangle(int maximalNumber) {
        // Menggunakan StringBuilder untuk efisiensi
        StringBuilder triangle = new StringBuilder();
        int row = 1;
        // loop untuk setiap baris
<<<<<<< HEAD
        while (row <= maximalNumber) { // kondisi terus berlanjut selama kurang dari atau sama dengan maximalNumber
            int col = 1; 
            while (col <= row) { // kolom akan terus berlanjut selama seperti ketentuan
                triangle.append("*"); // menambahkan bintang 
=======
        while (row <= maximalNumber) {  // kondisi terus berlanjut selama kurang dari atau sama dengan maximalNumber
            int col = 1;
            while (col <= row) { // kolom akan terus berlanjut selama seperti ketentuan
                triangle.append("*"); // menambahkan bintang
>>>>>>> 44f789aa9c56a83a7293fb0d1e93b463e9303166
                col++; // increment
            }
            
            if (row < maximalNumber) {
                triangle.append("\n");
            }
            row++; // increment baris untuk baris selanjutnya
        }
        return triangle.toString();
<<<<<<< HEAD
        // return hasil segitiga bintangnya
=======
        // return hasil segitigas bintangnya
>>>>>>> 44f789aa9c56a83a7293fb0d1e93b463e9303166
    }
}
