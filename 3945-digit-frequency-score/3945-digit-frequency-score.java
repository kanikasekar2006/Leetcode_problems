class Solution {
    public int digitFrequencyScore(int n) {
    String str=String.valueOf(n);
    int res[]=new int[str.length()];
    for(int i=0;i<res.length;i++){
        res[i]=str.charAt(i)-'0';
    } 
    int ans[]=new int[res.length];
    for(int i=0;i<res.length;i++){
        boolean seenBefore = false;
            for (int k = 0; k < i; k++) {
                if (res[k] == res[i]) {
                    seenBefore = true;
                    break;
                }
            }
            if (seenBefore) {
                continue;
            }
     int count=1;
     for(int j=i+1;j<res.length;j++){
        if(res[i]==res[j]){
            count++;
        }
     }

     ans[i]=res[i]*count;

    }
    int sum=0;
    for(int nums:ans){
      sum=sum+nums;
    }
         return sum;
    }
       
    }
