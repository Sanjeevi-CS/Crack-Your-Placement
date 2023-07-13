import java.util.*;

public class Q16_ChocolateDistribution {
    public static int ans(int arr[], int m) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n < m) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            min = Math.min(min, arr[i + m - 1] - arr[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int m = input.nextInt();
        System.out.println(ans(arr, m));
    }
}
