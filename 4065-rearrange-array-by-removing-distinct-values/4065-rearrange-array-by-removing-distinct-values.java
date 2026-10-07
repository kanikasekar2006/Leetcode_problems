class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer>l=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        for(int n:nums){
            list.add(n);
        }
        while(!list.isEmpty()){
         Set<Integer>set=new TreeSet<>(list);
         for(int num:set){
            l.add(num);
         }
         for(int n1:set){
            list.remove(Integer.valueOf(n1));
         }
        }
        int ans[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}