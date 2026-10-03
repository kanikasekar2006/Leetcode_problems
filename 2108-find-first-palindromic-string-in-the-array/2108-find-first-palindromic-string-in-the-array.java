class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String str = words[i];
            int j=0;int k=str.length()-1;
            boolean b=true;
            while(j<k){
                if(str.charAt(j)!=str.charAt(k)){
                    b=false;
                  break;
                }
                 j++;
                 k--;
            }
            if(b){
                return str;
            }
        }
        return "";
    }
}