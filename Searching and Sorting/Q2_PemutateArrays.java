import java.util.*;

public class Q2_PemutateArrays {
    public static boolean ans(int a[], int b[], int k) {
        int n = a.length;
        int m = b.length;
        if (n != m) {
            return false;
        }
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] > k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int m = input.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            b[i] = input.nextInt();
        }
        System.out.println(ans(a, b,m));
    }
}
