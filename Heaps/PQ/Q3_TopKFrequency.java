package Heaps.PQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Q3_TopKFrequency {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, List<Integer>> sortMap = new TreeMap<>((a, b) -> b - a);
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int key : countMap.keySet()) {
            int value = countMap.get(key);
            List<Integer> numList = sortMap.getOrDefault(value, new ArrayList<>());
            numList.add(key);
            sortMap.put(value, numList);
        }

        List<Integer> res = new ArrayList<>();

        for (List l : sortMap.values()) {
            if (res.size() < k) {
                res.addAll(l);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
