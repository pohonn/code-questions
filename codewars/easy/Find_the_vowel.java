package easy;

import java.util.ArrayList;

/**
 * We want to know the index of the vowels in a given word, for example, there
 * are two vowels in the word super (the second and fourth letters).
 * So given a string "super", we should return a list of [2, 4].
 * 
 * Some examples:
 * Mmmm => []
 * Super => [2,4]
 * Apple => [1,5]
 * YoMama -> [1,2,4,6]
 * 
 * NOTES:
 * Vowels in this context refers to: a e i o u y (including upper case)
 * This is indexed from [1..n] (not zero indexed!)
 */

public class Find_the_vowel {
    public static void main(String[] args) {
        int[] vowelIndices = vowelIndices("wRIZqVRjSEbmMvwyqAVbqSDmPEDxYPWhBi");
        for (int i : vowelIndices) {
            System.out.println(i);
        }
    }

    public static int[] vowelIndices(String word) {

        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {

            if (String.valueOf(word.toLowerCase().charAt(i)).contains("e")) {
                index.add(i + 1);
            } else if (String.valueOf(word.toLowerCase().charAt(i)).contains("o")) {
                index.add(i + 1);

            } else if (String.valueOf(word.toLowerCase().charAt(i)).contains("a")) {
                index.add(i + 1);

            } else if (String.valueOf(word.toLowerCase().charAt(i)).contains("i")) {
                index.add(i + 1);

            } else if (String.valueOf(word.toLowerCase().charAt(i)).contains("u")) {
                index.add(i + 1);
            } else if (String.valueOf(word.toLowerCase().charAt(i)).contains("y")) {
                index.add(i + 1);
            }
        }

        return index.stream().mapToInt(Integer::intValue).toArray();
    }

}
