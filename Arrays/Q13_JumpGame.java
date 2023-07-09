class Jumpgame {
    public boolean canJump(int[] nums) {
        if(nums[0]==0 && nums.length!=1){
            return false;
        }
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==n-1){
                return true;    
            }
            if(nums[i]==0){
                int flag=1;
                for(int j=i-1;j>=0;j--){
                    if(nums[j]>flag){
                        break;
                    }
                    if(j==0){
                        return false;
                    }
                    flag++;
                }
            }
        }
        return true;

        
    }
}