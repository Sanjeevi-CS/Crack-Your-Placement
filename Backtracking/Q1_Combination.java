package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q1_Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> subsets = new ArrayList();
        combine(1, n, new ArrayList(), subsets, k);
        return subsets;
    }

    void combine(int start, int n, List<Integer> arr, List<List<Integer>> subsets, int k) {
        if (arr.size() == k) {
            subsets.add(new ArrayList(arr));
            return;
        }
        for (int i = start; i <= n; i++) {
            arr.add(i);
            combine(i + 1, n, arr, subsets, k);
            arr.remove(arr.size() - 1);
        }
    }
}
