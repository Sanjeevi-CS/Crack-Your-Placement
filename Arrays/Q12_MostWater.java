public class Q12_MostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int area = 0;
        while (start < end) {
            int s = height[start];
            int l = height[end];
            int min = Math.min(s, l);
            area = Math.max(area, min * (end - start));
            if (s < l)
                start++;
            else
                end--;
        }
        return area;
    }
}
