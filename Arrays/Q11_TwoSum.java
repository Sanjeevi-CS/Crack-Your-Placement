import java.util.HashMap;

public class Q11_TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int d = target - nums[i];
                if (map.containsKey(d)) {
                    return new int[] { i, map.get(d) };
                } else {
                    map.put(nums[i], i);
                }
            }
            return new int[] { 0, 0 };
        }
    }
}
