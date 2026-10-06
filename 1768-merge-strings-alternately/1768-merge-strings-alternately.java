class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s=word1+word2;
        int n1=word1.length();
        int n2=s.length();
        int i=0;
        int j=n1;
        String ans="";
        while(i<n1 ||j<n2){
            if(i<n1){
         ans=ans+s.charAt(i);
         i++;
         }
           if(j<n2){
         ans=ans+s.charAt(j);

         j++;
           }

        }
        return ans;

    }
}