class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int i;
        for (i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int max = sum;
        int j = cardPoints.length - 1;
        while (--i >= 0) {
            sum = sum - cardPoints[i] + cardPoints[j--];
            max = Math.max(sum, max);
        }
        return max;
    }
}