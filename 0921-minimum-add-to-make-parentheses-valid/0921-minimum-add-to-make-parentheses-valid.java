class Solution {
    public int minAddToMakeValid(String s) {
        char ch[]=s.toCharArray();
        Stack <Character> stack=new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(stack.isEmpty()){
                    stack.push(ch[i]);
                    continue;
                }
            if(ch[i]=='('){
                stack.push(ch[i]);
            }
            else{   
            char c=stack.peek();
            if(c=='('){
                stack.pop();
            }
            else{
                stack.push(ch[i]);
            }
        }
        }
           
        return stack.size();
    }
}