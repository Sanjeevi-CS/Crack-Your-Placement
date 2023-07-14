import java.util.Scanner;

public class Q5_FindingPairs {
    class Pairs {
        public static void pairs(int arr[], int n, int diff) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (Math.abs(arr[i] - arr[j]) == diff) {
                        System.out.println(arr[i] + " " + arr[j]);
                        return;
                    }
                }
            }
            System.out.println("Not found");
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int diff = input.nextInt();
            pairs(arr, n, diff);

        }
    }

}
