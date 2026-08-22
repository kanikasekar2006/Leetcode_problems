class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int temp=n;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            prod=prod*digit;
            n=n/10;
        }
        int ans=sum+prod;
        if(temp%ans==0){
            return true;
        }
        return false;
    }
}