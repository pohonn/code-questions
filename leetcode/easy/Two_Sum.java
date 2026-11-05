
import java.util.HashMap;
import java.util.Map;

class Two_Sum {

    /**
     * 
     * QUESTIONS:
     * You are given an array of integers nums and an integer target, return indices
     * of the two numbers such that they add up to target.
     * 
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     * 
     * You can return the answer in any order.
     * ------------------------------------------------------------
     * 
     * EXAMPLE :
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     */

    public static void main(String[] args) {
        int[] test = { -3, 4, 3, 90 };

        int[] twoSum = twoSum(test, 0);
        for (int i : twoSum) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            // apakah si pasangan sudah pernah kita simpan di Map
            if (map.containsKey(complement)) {
                // Kalau ketemu, kembalikan indeks si pasangan dan indeks saat ini
                return new int[] { map.get(complement), i };
            }

            // Kalau belum ketemu, masukkan angka saat ini dan indeksnya ke Map
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}