import java.util.Stack;

public class Valid_Parentheses {

    public static void main(String[] args) {

        boolean valid = isValid("{([(])}"); // false
        System.out.println(valid);

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>(); // last in, first out

        for (char character : s.toCharArray()) {
            // kalau ketemu, masukin ke stack
            if (character == '{' || character == '[' || character == '(') {
                stack.push(character);
            } else {

                // buat menghapus char terakhir masuk
                char top = stack.pop();

                // kalau ketemu close pharantheses, cocokin sama yang mau di hapus tdi
                if (character == '}' && top != '{') {
                    return false;
                }
                if (character == ']' && top != '[') {
                    return false;
                }
                if (character == ')' && top != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();

        // else if ((s.contains("{") && s.contains("}")) ||
        // (s.contains("[") && s.contains("]")) ||
        // (s.contains("(") && s.contains(")"))) {
        // return true;

        // cek isi string
        // for (int i = 0; i < s.length(); i++) {
        // // cek apakah cukup bracket-nya
        // if ((s.contains("{") ) ||
        // (s.contains("(") && s.contains(")") ||
        // (s.contains("[") && s.contains("]")))) {
        // return true;
        // } else {
        // return false;
        // }
        // }

    }

}
