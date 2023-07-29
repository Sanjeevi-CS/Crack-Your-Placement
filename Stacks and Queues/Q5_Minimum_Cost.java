import java.util.ArrayList;
import java.util.List;

public class Q5_Minimum_Cost {
    public int mctFromLeafValues(int[] arr) {
        int r=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            l.add(arr[i]);
        }
        boolean clean=false;
        while(!clean){
            int min=Integer.MAX_VALUE;
            int min1=0;
            int min2=0;
            for(int i=1;i<l.size();i++){
                if(min>l.get(i-1)*l.get(i)){
                    min=l.get(i-1)*l.get(i);
                    min1=i-1;
                    min2=i;
                }
            }
            if(l.get(min1)>l.get(min2)){
                l.remove(min2);
            }
            else{
                l.remove(min1);
            }
            if(l.size()<2){
             clean=true;
            }
            r+=min;
        }
        return r;
    }
}
