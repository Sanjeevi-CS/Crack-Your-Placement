import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] p, int k) {
        PriorityQueue<node> pq = new PriorityQueue<>((a, b) -> a.dis - b.dis);
        for (int i = 0; i < p.length; i++) {
            int total = p[i][0] * p[i][0] + p[i][1] * p[i][1];
            node n = new node(total, p[i][0], p[i][1]);
            pq.add(n);
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k && pq.size() > 0; i++) {
            node n = pq.poll();
            ans[i][0] = n.x;
            ans[i][1] = n.y;
        }
        return ans;
    }
}

class node {
    node value;
    int dis;
    int x;
    int y;

    node(int dis, int x, int y) {
        this.dis = dis;
        this.x = x;
        this.y = y;
    }
}