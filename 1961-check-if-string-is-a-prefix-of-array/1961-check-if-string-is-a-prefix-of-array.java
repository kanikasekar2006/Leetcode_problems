class Solution {
    public boolean isPrefixString(String s, String[] words) {
       StringBuilder sb=new StringBuilder();
       for(String str:words){
        sb.append(str);
       if(sb.toString().equals(s)){
        return true;
       }
       if(sb.length()>s.length()){
        return false;
       }
    }
    return false;
    }
}