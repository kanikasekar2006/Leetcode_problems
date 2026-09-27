class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] plateCount = new int[26];
        for (int i = 0; i < licensePlate.length(); i++) {
            char c = licensePlate.charAt(i);
            if (Character.isLetter(c)) {
                plateCount[Character.toLowerCase(c) - 'a']++;
            }
        }
        
        String result = null;
        for (String word : words) {
            int[] wordCount = new int[26];
            for (int j = 0; j < word.length(); j++) {
                wordCount[word.charAt(j) - 'a']++;
            }
            
            if (completes(plateCount, wordCount)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        
        return result;
    }
    
    private boolean completes(int[] plateCount, int[] wordCount) {
        for (int i = 0; i < 26; i++) {
            if (wordCount[i] < plateCount[i]) {
                return false;
            }
        }
        return true;
    }
}