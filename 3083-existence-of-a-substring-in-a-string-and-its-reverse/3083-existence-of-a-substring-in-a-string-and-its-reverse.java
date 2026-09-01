class Solution {
    public boolean isSubstringPresent(String s) {
        String rev=new StringBuilder(s).reverse().toString();
       
        for(int i=0;i<s.length()-1;i++){
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(i)== rev.charAt(j)&& s.charAt(i+1)==rev.charAt(j+1)){
                    return true;
                }
            }
        }
        return false;
    }
}