import java.util.Stack;

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // Holds the score for the current depth level

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0); // Start a new nested level
            } else {
                int innerScore = stack.pop();
                int outerScore = stack.pop();
                // () gives 1, otherwise (A) gives 2 * A
                int currentScore = outerScore + Math.max(2 * innerScore, 1);
                stack.push(currentScore);
            }
        }

        return stack.pop();
    }
}