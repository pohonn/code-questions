
/**
 * QUESTIONS:
 * A Narcissistic Number (or Armstrong Number) is a positive number which is the
 * sum of its own digits, each raised to the power of the number of digits in a
 * given base. In this Kata, we will restrict ourselves to decimal (base 10).
 * 
 * Example:
 * For example, take 153 (3 digits), which is narcissistic:
 * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * 
 * and 1652 (4 digits), which isn't:
 * 1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
 * 
 */

public class Narcissistic_Number {

    public static void main(String[] args) {
        boolean narcissistic = isNarcissistic(153);
        System.out.println(narcissistic);
    }

    public static boolean isNarcissistic(int number) {

        String numberStr = String.valueOf(number);
        int temp = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            temp += (int) Math.pow(Integer.valueOf(String.valueOf(numberStr.charAt(i))), numberStr.length());
        }

        if (temp == number) {
            return true;
        } else {
            return false;
        }
    }
}
