// package Searching and Sorting;

public class Q1_PeakElement {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                j = i;
            }
        }
        return j;
    }
}
