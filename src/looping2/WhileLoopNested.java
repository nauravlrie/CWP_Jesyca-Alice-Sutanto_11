package looping2;

public class WhileLoopNested {
    public String getTriangle(int maximalNumber) {
        // Menggunakan StringBuilder untuk efisiensi string agar tidak membuat banyak objek string baru
        StringBuilder triangle = new StringBuilder();
        int row = 1;
        // loop untuk setiap baris
        while (row <= maximalNumber) { // Kondisi baris berlanjut selama baris kurang dari atau sama dengan maxNumber
            int col = 1;
            while (col <= row) { // Kondisi kolom berlanjut selama kolom kurang dari atau sama dengan baris
                triangle.append("*"); // Menambahkan bintang ke baris saat ini
                col++; // Increment kolomnya untuk baris berikutnya
            }
            // Menambahkan baris baru jika itu bukan baris terakhir
            if (row < maximalNumber) {
                triangle.append("\n");
            }
            row++; // Increment baris untuk baris berikutnya
        }

        // return hasil segitiga bintang nya
        return triangle.toString();
    }
}