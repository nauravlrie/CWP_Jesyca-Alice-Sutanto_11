package condition2;

public class GradeNested {
public String getGradeInfo(String codeInputSubject, int codeInputScore) {
    String grade;
    if (codeInputSubject.equals("Math")) {
        if (codeInputScore >= 90) {
            grade = "A";
        } else if (codeInputScore >= 75) {
            grade = "B";
        } else if (codeInputScore >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }
        return "Subject: Math, Grade: " + grade;
    } else if (codeInputSubject.equals("English")) {
        if (codeInputScore >= 85) {
            grade = "A";
        } else if (codeInputScore >= 70) {
            grade = "B";
        } else if (codeInputScore >= 55) {
            grade = "C";
        } else {
            grade = "F";
        }
        return "Subject: English, Grade: " + grade;
    } else {
        return "Subject: Unknown, Grade: N/A";
        }
    }
}
