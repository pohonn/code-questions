public class Longers_Comman_Prefix {

    public static void main(String[] args) {

        String[] string = { "Kami", "Kita", "Kalian" };

        System.out.println(longestCommonPrefix(string));

    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

}
