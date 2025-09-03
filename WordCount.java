 
package assignment_8;
     import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine().trim();

        int count = input.isEmpty() ? 0 : input.split("\\s+").length;
        System.out.println("So tu: " + count);
     }
}


