 
package assignment_8;
public class LongestCommonSubstring {
    public static String findLCS(String s1, String s2) {
        String longest = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String sub = s1.substring(i, j);
                if (s2.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String s1 = "ABCDEF", s2 = "XBCYDEFZ";
        System.out.println("LCS: " + findLCS(s1, s2));
    }
}


