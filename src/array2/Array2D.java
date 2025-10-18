package array2;
public class Array2D {
    // menampilkan informasi matriks 2d
    public String getMatrixInfo(int[][] matrix) {
        StringBuilder result = new StringBuilder(); // digunakan untuk menyimpan hasil output
        int totalSum = 0; // menyimpan jumlah total
        int elementCount = 0; // untuk menghitung jumlah elemen

        for (int i = 0; i < matrix.length; i++) { 
            // menampilkan nomor baris
            result.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < matrix[i].length; j++) { 
                int number = matrix[i][j];  // mendapatl nolai dari elemnnya
                totalSum += number; // menambahkan jumlah total
                elementCount++; 
                result.append(number).append(number % 2 == 0 ? "E" : "O").append(" "); 
            }
            result.setLength(result.length() - 1);
            result.append(" \n");
        }
        result.append("Total: ").append(totalSum).append("\n");
        double average = (double) totalSum / elementCount;
        result.append("Average: ").append(String.format("%.1f", average));
        return result.toString();
        // return hasil output
    }
}
