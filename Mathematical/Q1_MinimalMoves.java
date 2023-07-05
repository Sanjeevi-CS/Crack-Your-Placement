package Mathematical;

import java.util.Arrays;

public class Q1_MinimalMoves {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int d = nums[i] - nums[0];
            count += d;
        }
        return count;
    }
}
