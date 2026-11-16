import java.util.Arrays;

/**
 * 
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
 * may assume that the majority element always exists in the array.
 * 
 */

public class MajorityElement {
    public static void main(String[] args) {

        int[] test = { 1, 1, 3, 3, 5, 5, 5 };
        System.out.println(majorityElement(test));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2]; // karena kalau majority, pasti mendominasi arraynya sampai ke tengah index
    }
}
