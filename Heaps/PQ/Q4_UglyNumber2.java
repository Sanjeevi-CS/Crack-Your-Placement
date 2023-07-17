class Q4_UglyNumber2 {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int a = 0;
        int b = 0;
        int c = 0;
        int f2 = 2;
        int f3 = 3;
        int f5 = 5;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(f2, f3), f5);
            arr[i] = min;
            if (f2 == min) {
                f2 = 2 * arr[++a];
            }
            if (f3 == min) {
                f3 = 3 * arr[++b];
            }
            if (f5 == min) {
                f5 = 5 * arr[++c];
            }
        }
        return arr[n - 1];
    }
}
