class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length/2;
        int i=0;
        int j=i+1;
        int count=0;
        Arrays.sort(nums);
        while(j<nums.length){
            if(nums[i]==nums[j]){
              count++;
              i=j+1;
              j=i+1;
            }
            else{
            j++;
            }
        }
        if(count==n){
            return true;
        }
        return false;
    }
}