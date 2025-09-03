 
package assignment_8;
     import java.util.Scanner;

public class LongestWord {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap cau: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            String clean = word.replaceAll("[^a-zA-Z]", "");
            if (clean.length() > longest.length()) longest = clean;
        }

        System.out.println("Tu dai nhat: " + longest);
    }
}

