class Solution {
    public String removeKdigits(String num, int k) {
        ArrayDeque<Character> st = new ArrayDeque<>();

        for(char ch: num.toCharArray()) {
            while(k!=0 && !st.isEmpty() && st.peek() > ch) {
                st.pop();
                k--;
            }
            if(!st.isEmpty() || ch != '0') st.push(ch);
        }

        while(k-- > 0 && !st.isEmpty()) st.pop();

        StringBuilder res = new StringBuilder();

        while(!st.isEmpty()) res.append(st.pop());

        String ans = res.reverse().toString();

        return ans == "" ? "0" : ans;
    }
}