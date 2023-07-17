package Heaps.PQ;

import java.util.Arrays;

public class Q6_SmallestPositiveMissing {
    static int missingNumber(int arr[], int size) {
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                if (arr[i] == count)
                    count++;
            }
        }
        return count;
    }
}
