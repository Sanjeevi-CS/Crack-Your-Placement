import java.util.Arrays;

public class Q4_TaskSheduler {
    public int leastInterval(char[] tasks, int n) {
        int [] arr=new int[26];
        for(int i=0;i<tasks.length;i++){
            int temp=tasks[i]-'A';
            arr[temp]++;
        }
        int c1=1;
        Arrays.sort(arr);
        int maxi=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==maxi){
                c1++;
            }
        }
        int ans=(maxi-1)*(n+1)+c1;
        return Math.max(ans,tasks.length);
    }
}
