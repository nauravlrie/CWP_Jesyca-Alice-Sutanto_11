package operator;

public class Number {
    //Menampilkan hasil operasi
public String getOperatorResults(int codeInputA, int codeInputB) {
    return "Sum: " + (codeInputA + codeInputB) + "\n" + 
           "Product: " + (codeInputA * codeInputB) + "\n" +
           "Is Equal: " + (codeInputA == codeInputB) + "\n" +
           "Logical AND: " + (codeInputA > 0 && codeInputB > 0) + "\n" +
           "Logical OR: " + (codeInputA < 0 || codeInputB > 0);
}
    
}
