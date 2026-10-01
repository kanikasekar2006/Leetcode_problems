class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length-1;i++){
            int max=prices[i];
            for(int j=i;j<prices.length-1;j++){
                if(max>=prices[j+1]){
                   prices[i]=max-prices[j+1];
                   break;
                }
            }
        }
        return prices;
    }
}