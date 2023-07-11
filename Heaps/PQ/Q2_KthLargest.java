package Heaps.PQ;

import java.util.Arrays;

public class Q2_KthLargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return (nums[nums.length - k]);
    }
}
