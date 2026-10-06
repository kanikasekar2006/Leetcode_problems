class Solution {
    public String reversePrefix(String s, int k) {
        String str="";
        for(int i=k-1;i>=0;i--){
            str=str+s.charAt(i);
        }
        if(k!=s.length()){
        for(int i=k;i<s.length();i++ ){
            str=str+s.charAt(i);
        }
        }
        return str;
    }
}