package condition1;

public class DayOfWeek {
public String getDayName(int codeInputDay) {
    String dayName;
    switch (codeInputDay) { 
        case 1:
        dayName = "Day: Monday";
            break;
        case 2:
        dayName = "Day: Tuesday";
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
