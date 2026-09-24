class Solution {
    public int smallestIndex(int[] nums) {
        int res=-1;
        int i=0;
        while(i<nums.length){
            int n=nums[i];
            int sum=0;
            if(n>9){
            while(n!=0){
                int digit=n%10;
                sum=sum+digit;
                n=n/10;         
            }
            }
            else{
                sum=nums[i];
            }
            if(sum==i){
                res=i;
                break;
            }
            
            
            
                    i++;
        }
        return res;
    }
}