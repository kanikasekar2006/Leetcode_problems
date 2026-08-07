class Solution {
    static int num(int a){
        int prod=1;
        while(a!=0){
            int digit=a%10;
            prod=prod*digit;
            a=a/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
       while(num(n)%t!=0){
        n++;
       }
       return n;
    }
}