package condition1;

public class DayOfWeek {
    // menampilkan nama hari dari angka yang dimasukkan
public String getDayName(int codeInputDay) {
    String dayName;
    switch (codeInputDay) { // menggunakan switch case 
        case 1: // jika angka 1
        dayName = "Day: Monday"; // menampilkan hari Senin dan begitu juga untuk angka lainnya
            break;
        case 2: // jika angka 2
        dayName = "Day: Tuesday"; // menampilkan hari selasa
            break;
        case 3:
        dayName = "Day: Wednesday";
            break;
        case 4:
        dayName = "Day: Thursday";
            break;
        case 5:
        dayName = "Day Friday";
            break;
        case 6:
        dayName = "Day Saturday";
            break;
        case 7:
        dayName = "Day Monday";
            break;
        default:
        dayName = "Day: Unknown";
            break;
        }
        return dayName;
    }
}
