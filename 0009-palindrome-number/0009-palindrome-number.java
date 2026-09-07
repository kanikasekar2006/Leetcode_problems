class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }
        int temp=x;
        int rev=0;
        while(temp>rev){
            int digit=temp%10;
            rev=rev*10+digit ;
            temp=temp/10;
        }
        
        return temp==rev||temp==rev/10 ;
    }
}