class Solution {
    public int largestInteger(int[] nums, int k) {
      List<Integer>list=new ArrayList<>();
        int res=-1;
        for(int j=0;j<nums.length;j++){
             int count=0;
             for(int m=0; m <= nums.length-k ; m++){
                list.clear();
            for(int i=m;i<m+k;i++){
                list.add(nums[i]);
            }
                if(list.contains(nums[j])){
                    count++;
                }
            }
            if(count==1 && nums[j]>res){
                res=nums[j];
            }
       
        }
        
        return res;
    }
}