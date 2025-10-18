package condition2;

public class NestedSwitch {
public String getSelection(int category, int choice) {
    switch (category) {
        case 1:
            switch (choice) {
                case 2:
                    return category + ", You selected: Coffee";
                default:
                    return category + ", invalid drink choice";
            }
        case 2: 
            switch (choice) {
                case 1:
                    return category + ", You selected: Pizza";
                default:
                    return category + ", Invalid food choice";
            }
                default:
                    return category + ", Invalid category";
            }
        }
}