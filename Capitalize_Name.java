
package assignment_8;
import java.util.Scanner;
public class Capitalize_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullName = scanner.nextLine();

        String[] words = fullName.trim().split("\\s+");
        StringBuilder capitalizedName = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String formatted = word.substring(0,1).toUpperCase() +
                                   word.substring(1).toLowerCase();
                capitalizedName.append(formatted).append(" ");
            }
        }

        System.out.println("Ten chuan hoa: " + capitalizedName.toString().trim());
     }
}

