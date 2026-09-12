class Solution {
    public boolean halvesAreAlike(String s) {
       int mid= s.length()/2;
       String str1=s.substring(0,mid).toLowerCase();
       String str2=s.substring(mid).toLowerCase();
        int s1=0;
        int s2=0;
       char str[]={'a','e','i','o','u'};
       for(int i=0;i<str.length;i++){
        
        for(int j=0;j<str1.length();j++){
            if(str1.charAt(j)==str[i]){
                s1++;
            }
             if(str2.charAt(j)==str[i]){
                s2++;
            }
        }
       }
       if(s1==s2){
        return true;
       }
       else{
        return false;
       }
    }
}