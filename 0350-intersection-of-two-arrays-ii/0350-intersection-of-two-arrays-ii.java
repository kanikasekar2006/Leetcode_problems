import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums1) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        int[] result = new int[nums1.length];
        int k = 0;

        for (int n : nums2) {
            int c = counts.getOrDefault(n, 0);
            if (c > 0) {
                result[k++] = n;
                counts.put(n, c - 1);
            }
        }

        return Arrays.copyOf(result, k);
    }
}