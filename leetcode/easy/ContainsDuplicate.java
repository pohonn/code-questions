import java.util.HashSet;

/**
 * 
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * 
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * 
 */

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] test = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(test));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashInt = new HashSet<>();
        boolean result = false;

        for (int i = 0; i < nums.length; i++) {
            if (!hashInt.add(nums[i])) {
                result = true;
                break;
            } else {
                hashInt.add(nums[i]);
            }
        }
        return result;
    }
}
