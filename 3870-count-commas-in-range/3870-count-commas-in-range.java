class Solution {
    public int countCommas(int n) {
       int count=0 ;
        if(n<1000){
            return 0;
        }
        int num=1000;
        while(num<=n){
            if(num>n){
               break;
            }
            num++;
            count++;
        }
        return count;
    }
}