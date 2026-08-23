class Solution {
    public boolean sumGame(String num) {
        
        int n = num.length();
        
        int sum1 = 0;
        int sum2 = 0;
        
        int q1 = 0;
        int q2 = 0;

        // First half
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                q1++;
            } else {
                sum1 += num.charAt(i) - '0';
            }
        }

        // Second half
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                q2++;
            } else {
                sum2 += num.charAt(i) - '0';
            }
        }

        // Odd number of '?' -> Alice wins
        if ((q1 + q2) % 2 == 1) {
            return true;
        }

        // Even number of '?' 
        return sum1 - sum2 != 9 * (q2 - q1) / 2;
    }
}