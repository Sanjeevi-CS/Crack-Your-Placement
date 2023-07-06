import java.util.Arrays;

public class Q10_MaximumProduct {
    public int maximumProduct(int[] nums) {
        int product = 1;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
