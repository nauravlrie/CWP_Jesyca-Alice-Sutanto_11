package looping2;

public class ForLoopNested {
    public String getGrid(int maximalNumber) {
        //Menggunakan StringBuilder untuk efisiensi string
        StringBuilder grid = new StringBuilder(); 
        // Loop untuk setiap kolom dalam baris
            for (int row = 1; row <= maximalNumber; row++) {
                //Loop untuk setiap kolom dalam baris
            for (int col = 1; col <= maximalNumber; col++) {
                grid.append("Row ").append(row).append(" Col ").append(col); 
                // Menambahkan kolom baru
                if (col < maximalNumber) {
                    grid.append("\n");

                }
            }
            // Menambahkan baris baru
                if (row < maximalNumber) {
                grid.append("\n");
            }
        }
        return grid.toString();
        // return hasil gridnya
    }
}