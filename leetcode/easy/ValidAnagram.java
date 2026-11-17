import java.util.Arrays;

/**
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 */
public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "wagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        boolean result = false;
        if (t.length() > s.length()) {
            return result;

        } else {

            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();

            // susun semua array agar kita tahu apakah arraynya sama atau tidak. klaau sama
            // berarti identik dan anagram
            Arrays.sort(tArray);
            Arrays.sort(sArray);

            if (Arrays.equals(sArray, tArray)) {
                result = true;
            }
        }
        return result;
    }
}
