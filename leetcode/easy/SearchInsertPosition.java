
/**
 * 
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 */

public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] nums = { 1, 3, 5, 6 };
        int searchInsert = searchInsert(nums, 7);
        System.out.println(searchInsert);
    }

    public static int searchInsert(int[] nums, int target) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
            } else if (nums[i] <= target) {
                result = i + 1;
            }
        }

        return result;

    }
}
