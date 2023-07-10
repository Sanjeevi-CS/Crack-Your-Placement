public class Q2_CountingBits {
    public int[] countBits(int n) {
        int arr[] = new int[++n];
        for (int i = 1; i < n; ++i) {
            arr[i] = arr[i & (i - 1)] + 1;
        }
        return arr;
    }
}
