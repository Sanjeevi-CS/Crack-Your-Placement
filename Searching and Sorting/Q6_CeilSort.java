public class Q6_CeilSort {
    class ceil {
        public static int ceil(int arr[], int n) {
            int i;
            int x = 3;
            int l = 0, h = n - 1;
            if (x <= arr[l]) {
                return l;
            }
            for (i = l; i < h; i++) {
                if (arr[i] == x) {
                    return i;
                }
                if (arr[i] < x && arr[i + 1] >= x) {
                    return i + 1;
                }
            }
            return -1;

        }
    }
}
