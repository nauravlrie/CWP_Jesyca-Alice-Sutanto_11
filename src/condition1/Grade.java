package condition1;

public class Grade {
    // menampilkan grade berdasrkan nilai
public String getGrade(int codeInputScore) {
    // menggunakan if else
    if (codeInputScore >= 90) {
    return "Grade: A";
    } else if (codeInputScore >= 75) { // jika nilai antara 75-89
        return "Grade: B"; // akan menampilkan grade B
    } else if (codeInputScore >= 60) {
        return "Grade: C";
    }else {
        return "Grade: F";
             }
        }
}
