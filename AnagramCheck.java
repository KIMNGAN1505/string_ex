 
package assignment_8;
   import java.util.*;
public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if (str1.length() != str2.length()) return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chuoi 1: ");
        String s1 = sc.nextLine();
        System.out.print("Chuoi 2: ");
        String s2 = sc.nextLine();

        System.out.println(areAnagrams(s1, s2) ? "La Anagram" : "Khong phai Anagram");
    }
}


