 
package assignment_8;
  import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
                compressed.append(input.charAt(i)).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        System.out.println("Chuoi nen: " + compressed);
     }
}


