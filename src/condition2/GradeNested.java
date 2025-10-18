package condition2;

public class GradeNested {
public String getGradeInfo(String codeInputSubject, int codeInputScore) {
    String grade;
    // menentukan grade berdasarkan mapel dan nilai menggunakan nested if else
    if (codeInputSubject.equals("Math")) { // jika pelajaran math
        if (codeInputScore >= 90) { // jika nilai 90 atau lebih
            grade = "A"; //maka akan mendaptkan grade A 
        } else if (codeInputScore >= 75) {
            grade = "B";
        } else if (codeInputScore >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }
        return "Subject: Math, Grade: " + grade;
        // me return output informasi mapel dan grade
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
    } else { // jika mata pelajaran itu tidak dikenali
        return "Subject: Unknown, Grade: N/A";
        }
    }
}
