package Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q5_Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> list = new ArrayList<>();
    permute(nums, 0, list);
    return list;
    }
    public void permute(int[] nums, int i, List<List<Integer>> list) {
    if (i == nums.length) {
        List<Integer> l1 = new ArrayList<>();
        for (int n : nums) {
            l1.add(n);
        }
        list.add(l1);
        return;
    }
    Set<Integer> set = new HashSet<>();
    for (int s = i; s < nums.length; s++) {
        if (set.add(nums[s])) {
            swap(nums, s, i);
            permute(nums, i + 1, list);
            swap(nums, s, i);
        }
    }
    }
     public void swap(int[] nums,int i,int j) {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
