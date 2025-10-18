package condition1;

public class Grade {
public String getGrade(int codeInputScore) {
    if (codeInputScore >= 90) {
    return "Grade: A";
    } else if (codeInputScore >= 75) {
        return "Grade: B"; 
    } else if (codeInputScore >= 60) {
        return "Grade: C";
    }else {
        return "Grade: F";
             }
        }
}
