import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ls.add(nums[i]);
            }
        }
        return ls;
    }
}