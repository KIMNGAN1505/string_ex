 
package assignment_8;
     import java.util.Scanner;

public class AcronymGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cum tu: ");
        String phrase = sc.nextLine();

        String[] words = phrase.trim().split("\\s+");
        StringBuilder acronym = new StringBuilder();

        for (String word : words) acronym.append(word.charAt(0));

        System.out.println("Acronym: " + acronym.toString().toUpperCase());
     }
}


