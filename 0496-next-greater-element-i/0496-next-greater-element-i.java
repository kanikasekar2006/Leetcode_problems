class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int max=nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(max!=nums2[j]){
                    continue;
                }
                else{
                    if(j!=nums2.length-1){
                        int m=j;int res=max;
                        while(m<nums2.length){
                           if(nums2[m]>res){
                            res= nums2[m];
                            break;
                           }
                           m++;
                        }
                        if(res==max){
                           arr[i]=-1;
                        }
                        else{
                            arr[i]=res;
                        }
                        
                    }
                    else{
                        arr[i]=-1;
                    }
                }
            }
        }
        return arr;
    }
}