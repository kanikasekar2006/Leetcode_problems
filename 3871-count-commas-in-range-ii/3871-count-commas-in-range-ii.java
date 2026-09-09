class Solution {
    public long countCommas(long n) {
        long count = 0;
        long lowerBound = 1000;
        
        while (n >= lowerBound) {
            count += (n - lowerBound + 1);
            lowerBound *= 1000;
        }
        
        return count;
    }
}