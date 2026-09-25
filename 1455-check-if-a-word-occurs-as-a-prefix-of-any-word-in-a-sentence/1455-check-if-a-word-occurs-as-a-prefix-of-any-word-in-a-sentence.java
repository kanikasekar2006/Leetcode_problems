class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int res=-1;
        String str[]=sentence.split(" ");
        String s  =searchWord;
        for(int i=0;i<str.length;i++){
            String s1=str[i];
            int count=0;
          for(int j=0;j<s1.length() && j<s.length() ;j++){
            if(s1.charAt(j)!=s.charAt(j)){
                break;
            }
            else{
                count++;
            }
          }
          if(count==s.length()) {
            res=i+1;
            break;
          }  
        }
       return res;
    }
}