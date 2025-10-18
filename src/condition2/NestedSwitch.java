package condition2;

public class NestedSwitch {
public String getSelection(int category, int choice) {
    // menentukan pilihan
    switch (category) { // menggunakan switch case
        case 1: // minuman
            switch (choice) {
                case 2: // coffee
                    return category + ", You selected: Coffee";
                default: // jika pil tidak diketahui
                    return category + ", invalid drink choice";
            }
        case 2: // makanan
            switch (choice) {
                case 1: // pizza
                    return category + ", You selected: Pizza";
                default:
                    return category + ", Invalid food choice";
            }
                default: // jika pil tidak dikenali
                    return category + ", Invalid category";
            }
        }
}
