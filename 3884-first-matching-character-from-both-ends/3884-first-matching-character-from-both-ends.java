class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        String str[]=s.split("");
        int i=0;
        int j=n-1;
        while(i<=j){
            if(!str[i].equals(str[j])){
               i++;
               j--;
            }
            else{
                return i;
            }
        }
        return -1;
    }
}