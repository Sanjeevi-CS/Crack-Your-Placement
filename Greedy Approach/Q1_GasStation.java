// package Greedy Approach;

public class Q1_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot = 0;
        int ans = 0;
        int ind = 0;
        for (int i = 0; i < gas.length; i++) {
            tot += gas[i] - cost[i];
            ans += gas[i] - cost[i];
            if (ans < 0) {
                ans = 0;
                ind = i + 1;
            }
        }
        if (tot < 0) {
            return -1;
        }
        return ind;
    }
}
