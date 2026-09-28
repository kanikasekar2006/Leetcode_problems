class Solution {
    public int maxDepth(String s) {
        int count=0;
        int r=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
           count++;
        }
        if(s.charAt(i)==')'){
            count--;
        }
        if(r<count){
            r=count;
        }
        }
        return r;
    }
}