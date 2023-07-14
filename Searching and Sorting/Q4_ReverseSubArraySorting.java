import java.util.Arrays;

public class Q4_ReverseSubArraySorting {
    class ReverseSubarraySorting{
        public  Boolean(int arr[],int n){
            int temp[]=new int[n];
            for(int i=0;i<n;i++)
                temp[i]=arr[i];
            Arrays.sort(temp);
            int f=0;
            for(f=0;f<n;f++){
                if(arr[f]!=temp[f])
                    break;
            }
            int b;
            for(b=n-1;b>=0;b--){
                if(arr[b]!=temp[b])
                    break;
            }
            if(f>=b){
                return true;
            }

            for (f = f + 1; f != b; f++) {
    if (arr[f - 1] < arr[f]) {
        return false;
    }
}
return true;
        }
    
}
