class Solution {
    public int sumCounts(List<Integer> nums) {
        int res=0;
        for(int i=0;i<nums.size();i++){
        int j=i;
        Set<Integer>set=new HashSet<>();
        while(j<nums.size()){
            set.add(nums.get(j));
            int n=set.size();
            j++;
            res=res+n*n;
        }
        }
        return res;
    }
}