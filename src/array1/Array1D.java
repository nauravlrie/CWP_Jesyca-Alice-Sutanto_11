package array1;

public class Array1D {
    // menampilkan apa saja arraynya dan jumlahnya
    public String getArrayInfo(int[] numbers) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        // for loop untuk mengakses apa saja arraynya
        for (int number : numbers) { // mengakses arraynya
            result.append(number).append(" "); // menambahkan arraynya ke hasil output
            sum += number; // menmbahkan ke jumlah 
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        result.append("\nSum: ").append(sum); 
        return result.toString(); 
        // return hasil output
    }
}
