class Solution {
    public boolean validPalindrome(String s) {
        String str[]=s.split("");
        int i=0;int j =str.length-1;
        while(i<j){
                if(str[i].equals(str[j])){
                   i++;
                   j--;
                }
                else{
                   return isPalindrome(str,i+1,j) || isPalindrome(str,i,j-1);
                }
            }
        return true;
    }
    public boolean isPalindrome(String str[],int i,int j){
        while(i<j){
            if(str[i].equals(str[j])){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}