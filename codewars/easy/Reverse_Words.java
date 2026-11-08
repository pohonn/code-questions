package easy;

/**
 * Complete the function that accepts a string parameter, and reverses each word
 * in the string. All spaces in the string should be retained.
 * 
 * Examples
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double spaces" ==> "elbuod secaps"
 */

public class Reverse_Words {
    public static void main(String[] args) {
        System.out.println(reverseWords("elbuod secaps"));
    }

    public static String reverseWords(final String original) {

        String[] words = original.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder reversedWord = new StringBuilder(words[i]);
            reversedWord.reverse();
            result.append(reversedWord);

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();

    }

}
