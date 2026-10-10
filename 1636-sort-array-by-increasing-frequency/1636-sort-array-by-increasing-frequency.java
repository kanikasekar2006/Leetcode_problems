class Solution {
    public int[] frequencySort(int[] nums) {
       
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Integer[] numsArr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) 
            numsArr[i] = nums[i];
    
        Arrays.sort(numsArr, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            
           
            if (freqA != freqB) {
                return freqA - freqB;
            }
           
            else {
                return b - a;
            }
        });

        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsArr[i];
        }

        return nums;
    }
}