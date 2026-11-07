package easy;

/**
 * Task
 * Your goal is to write a function that removes the first and last characters
 * of a string. You're given one parameter, the original string.
 * 
 * Important: Your function should handle strings of any length ≥ 2 characters.
 * For strings with exactly 2 characters, return an empty string.
 * 
 */

public class RemoveFirst_LastCharacter {

    public static void main(String[] args) {

        System.out.println(remove("Hello"));
        System.out.println(remove("Hello World"));
        System.out.println(remove("Hi"));
    }

    public static String remove(String str) {

        if (str.length() > 2) {

            StringBuilder stringBuilder = new StringBuilder(str);

            StringBuilder start = stringBuilder.deleteCharAt(0);
            stringBuilder.deleteCharAt(start.length() - 1);
            return stringBuilder.toString();
        } else {
            return "";
        }

    }

}
