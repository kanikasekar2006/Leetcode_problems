import java.util.*;
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int arr[]=new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i)-'0';
        }
         int i=0;int j=i+1;
         while(j<arr.length){
            int diff=Math.abs(arr[i]-arr[j]);
            if(diff>2){
                return false;
            }
            i++;
            j++;
        }
        return true;

    }
}