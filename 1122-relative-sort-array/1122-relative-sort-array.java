class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k=0;
        int arr[]=new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                   if(arr2[i]==arr1[j]){
                    arr[k++]=arr1[j];
                   }
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if(!contains(arr2,arr1[i])){
                arr[k++]=arr1[i];
            }
        }
        return arr;
    }
        private boolean contains(int[] arr2,int val){
            for(int nums:arr2){
                if(nums==val){
                    return true;
                }
            }
            return false;
        }
}