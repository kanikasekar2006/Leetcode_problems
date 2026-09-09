class Solution {
    public int missingMultiple(int[] nums, int k) {
        int res=0;
        for(int i=1;i<=101;i++){
            int n=i*k;
             int count=0;
            for(int j=0;j<nums.length;j++){
               
                if(nums[j]==n){
                    count++;
                }
            }
            if(count==0){
              res=n;
              break;
            }
        }
        return res;
    }
}