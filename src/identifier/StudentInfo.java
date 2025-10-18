package identifier;

public class StudentInfo {
    // untuk menampilkan inormasi siswa
    public String showStudentInfo(String codeInputName, int codeInputAge, double codeInputGpa) {
    return "Name: " + codeInputName + "\n" + // menampilkan nama
           "Age : " + codeInputAge + "\n" + // menampilkan umur
           "GPA : " + codeInputGpa + "\n"; // menampilkan Gpa
    }
}
