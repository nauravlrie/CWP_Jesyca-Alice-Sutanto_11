package looping2;

public class DoWhileLoopNested {
    public String getNumberTriangle(int maximalNumber) {
        // Menggunaka StringBuilder
        StringBuilder triangle = new StringBuilder();
        int row = 1;
        do { // loop untuk setiap barisan
            int col = 1; 
            // loop untuk setiap kolom dan baris
            do {
                triangle.append(col); //Memasukkan nomor kolam ke baris
                col++; //increment
            } while (col <= row); 
            if (row < maximalNumber) { 
                triangle.append("\n"); 
            } 
            row++; // increment
        } while (row <= maximalNumber); 
        return triangle.toString();
        // return hail segitiganya
    }
}
