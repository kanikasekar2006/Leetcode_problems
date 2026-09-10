class Solution {
    public int heightChecker(int[] heights) {
      int except[]=new int[heights.length];
      for(int i=0;i<except.length;i++){
        except[i]=heights[i];
      } 
      Arrays.sort(heights);
      int count=0;
      for(int i=0;i<heights.length;i++){
            if(heights[i]!=except[i]){
                count++;
            }
      }
      return count;
    }
}