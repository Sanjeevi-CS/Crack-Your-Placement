import java.util.PriorityQueue;

public class Q3_MinimumSum {
    public static long solve(int[] a) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        for (int x : a)
            pq.add(x);

        while (!pq.isEmpty()) {
            num1.append(pq.poll() + "");
            if (!pq.isEmpty())
                num2.append(pq.poll() + "");
        }

        long sum = Long.parseLong(num1.toString()) +
                Long.parseLong(num2.toString());

        return sum;
    }
}
