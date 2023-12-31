public class Q8_DEleterandEarn {
    public int deleteAndEarn(int[] nums) {
     
        int maxNum = 0;
        for(int n: nums) {
            maxNum = Math.max(n, maxNum);
        }

       
        int[] A = new int[maxNum+1];

        for(int n: nums) {
            A[n] += n;
        }
      
        for(int i=2; i<A.length; i++) {
            A[i] = Math.max(A[i-2] + A[i], A[i-1]);
        }
        return A[A.length-1];
    }
}
