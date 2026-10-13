class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int n=nums.length/2;
        long sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            sum1=sum1+nums[i];
        }
        for(int i=n;i<nums.length;i++){
            sum2=sum2+nums[i];
     }
     return sum2-sum1;
    }
}